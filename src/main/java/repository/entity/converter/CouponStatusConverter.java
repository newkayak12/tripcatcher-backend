package repository.entity.converter;

import repository.entity.enums.CouponStatus;

import javax.persistence.AttributeConverter;
import java.util.Objects;

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
