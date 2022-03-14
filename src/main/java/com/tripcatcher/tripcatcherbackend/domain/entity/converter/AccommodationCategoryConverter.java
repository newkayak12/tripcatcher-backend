package com.tripcatcher.tripcatcherbackend.domain.entity.converter;

import com.tripcatcher.tripcatcherbackend.domain.entity.enums.AccommodationEnums;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Arrays;
import java.util.Objects;
@Converter(autoApply = true)
public class AccommodationCategoryConverter  implements AttributeConverter<AccommodationEnums.AccommodationCategory, Integer> {

    @Override
    public Integer convertToDatabaseColumn(AccommodationEnums.AccommodationCategory accommodationCategory) {
        if(Objects.isNull(accommodationCategory)){
            return null;
        }
        return accommodationCategory.getCode();
    }

    @Override
    public AccommodationEnums.AccommodationCategory convertToEntityAttribute(Integer integer) {
        return Arrays.stream(AccommodationEnums.AccommodationCategory.values())
                .filter(v->integer.equals(v.getCode())).findFirst().orElse(null);
    }
}
