package domain.entity.enums;

import lombok.Getter;

@Getter
public enum CouponStatus {
    NOT_USED(0),USED(1);
    private int code;
    CouponStatus(int code){
        this.code = code;
    }
}
