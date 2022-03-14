package com.tripcatcher.tripcatcherbackend.domain.entity.converter;

import com.tripcatcher.tripcatcherbackend.domain.entity.enums.ReservationEnums;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Arrays;
import java.util.Objects;
@Converter
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
