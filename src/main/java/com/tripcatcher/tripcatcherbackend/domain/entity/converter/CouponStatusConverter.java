package com.tripcatcher.tripcatcherbackend.domain.entity.converter;

import com.tripcatcher.tripcatcherbackend.domain.entity.enums.CouponStatus;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Objects;
@Converter
public class CouponStatusConverter implements AttributeConverter<CouponStatus, Integer> {
    @Override
    public Integer convertToDatabaseColumn(CouponStatus couponStatus) {
        if(Objects.isNull(couponStatus)){
            return null;
        }
        return couponStatus.getCode();
    }

    @Override
    public CouponStatus convertToEntityAttribute(Integer integer) {
        switch (integer){
            case 0:
                return CouponStatus.NOT_USED;
            case 1:
                return CouponStatus.USED;
            default:
                return null;
        }
    }
}
