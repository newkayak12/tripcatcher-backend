package domain.entity.converter;

import domain.entity.enums.ReservationEnums;

import javax.persistence.AttributeConverter;
import java.util.Arrays;
import java.util.Objects;

public class ReservationStatusConverter implements AttributeConverter<ReservationEnums.ReservationStatus, Integer> {
    @Override
    public Integer convertToDatabaseColumn(ReservationEnums.ReservationStatus reservationStatus) {
        if(Objects.isNull(reservationStatus)){
            return null;
        }
        return  reservationStatus.getCode();
    }

    @Override
    public ReservationEnums.ReservationStatus convertToEntityAttribute(Integer integer) {
        return Arrays.stream(ReservationEnums.ReservationStatus.values()).filter(v->integer.equals(v.getCode()))
                .findFirst().orElse(null);
    }
}
