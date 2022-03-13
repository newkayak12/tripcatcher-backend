package domain.entity.converter;

import domain.entity.enums.ReservationEnums;

import javax.persistence.AttributeConverter;
import java.util.Arrays;
import java.util.Objects;

public class ReservationPaymentMethodsConverter implements AttributeConverter<ReservationEnums.ReservationPaymentMethods, Integer> {
    @Override
    public Integer convertToDatabaseColumn(ReservationEnums.ReservationPaymentMethods reservationPaymentMethods) {
        if(Objects.isNull(reservationPaymentMethods)){
            return null;
        }
        return  reservationPaymentMethods.getCode();
    }

    @Override
    public ReservationEnums.ReservationPaymentMethods convertToEntityAttribute(Integer integer) {
        return Arrays.stream(ReservationEnums.ReservationPaymentMethods.values()).filter(v->integer.equals(v.getCode()))
                .findFirst().orElse(null);
    }
}
