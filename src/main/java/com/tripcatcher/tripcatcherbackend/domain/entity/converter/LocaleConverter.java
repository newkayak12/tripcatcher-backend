package com.tripcatcher.tripcatcherbackend.domain.entity.converter;

import com.tripcatcher.tripcatcherbackend.domain.entity.enums.Locale;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Objects;
@Converter
public class LocaleConverter implements AttributeConverter<Locale,Integer> {

    @Override
    public Integer convertToDatabaseColumn(Locale locale) {
        if(Objects.isNull(locale)){
            return null;
        }
        return locale.getCode();
    }

    @Override
    public Locale convertToEntityAttribute(Integer integer) {
        switch (integer){
            case 1:
                return Locale.KR;
            case 2:
                return Locale.JP;
            case 3:
                return Locale.EN;
            default:
                return null;
        }
    }
}
