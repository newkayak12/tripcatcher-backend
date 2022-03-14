package domain.entity.converter;

import domain.entity.enums.AccommodationEnums;

import javax.persistence.AttributeConverter;
import java.util.Arrays;
import java.util.Objects;

public class AccommodationSearchFilterStateConverter implements AttributeConverter<AccommodationEnums.State, Integer> {

    @Override
    public Integer convertToDatabaseColumn(AccommodationEnums.State state) {
        if(Objects.isNull(state)){
            return null;
        }
        return state.getCode();
    }

    @Override
    public AccommodationEnums.State convertToEntityAttribute(Integer integer) {
        return Arrays.stream(AccommodationEnums.State.values())
                .filter(v->integer.equals(v.getCode()))
                .findFirst().orElse(null);
    }
}
