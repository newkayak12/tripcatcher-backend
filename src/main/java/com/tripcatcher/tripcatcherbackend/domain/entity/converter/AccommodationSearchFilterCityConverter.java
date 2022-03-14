package com.tripcatcher.tripcatcherbackend.domain.entity.converter;

import com.tripcatcher.tripcatcherbackend.domain.entity.enums.AccommodationEnums;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Arrays;
import java.util.Objects;
@Converter
public class AccommodationSearchFilterCityConverter implements AttributeConverter<AccommodationEnums.City, Integer> {
    @Override
    public Integer convertToDatabaseColumn(AccommodationEnums.City city) {
        if(Objects.isNull(city)){
            return null;
        }
        return city.getCode();
    }

    @Override
    public AccommodationEnums.City convertToEntityAttribute(Integer integer) {
        return Arrays.stream(AccommodationEnums.City.values())
                .filter(v->integer.equals(v.getCode()))
                .findFirst().orElse(null);
    }
}
