package domain.entity.converter;

import domain.entity.enums.AccommodationEnums;

import javax.persistence.AttributeConverter;
import java.util.Arrays;
import java.util.Objects;

public class AccommodationCategoryDetailConverter implements AttributeConverter<AccommodationEnums.AccommodationCategoryDetail, Integer> {
    @Override
    public Integer convertToDatabaseColumn(AccommodationEnums.AccommodationCategoryDetail accommodationCategoryDetail) {
        if(Objects.isNull(accommodationCategoryDetail)){
            return null;
        }
        return accommodationCategoryDetail.getCode();
    }

    @Override
    public AccommodationEnums.AccommodationCategoryDetail convertToEntityAttribute(Integer integer) {
        return Arrays.stream(AccommodationEnums.AccommodationCategoryDetail.values())
                .filter(v->integer.equals(v.getCode()))
                .findFirst().orElse(null);
    }
}
