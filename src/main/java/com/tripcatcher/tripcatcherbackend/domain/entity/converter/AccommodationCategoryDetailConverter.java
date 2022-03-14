package com.tripcatcher.tripcatcherbackend.domain.entity.converter;

import com.tripcatcher.tripcatcherbackend.domain.entity.enums.AccommodationEnums;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Arrays;
import java.util.Objects;
@Converter
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
