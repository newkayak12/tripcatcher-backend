package repository.entity.converter;

import repository.entity.enums.Locale;

import javax.persistence.AttributeConverter;
import java.util.Objects;

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
