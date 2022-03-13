package domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class CouponDto implements Serializable {
    private static final long serialVersionUID = -5803147938189430034L;
    private final Long couponNo;
    private final String couponName;
    private final Integer couponDiscountRate;
    private final LocalDateTime couponIssuedDate;
    private final LocalDateTime couponExpirationDate;
    private final Integer couponIssuedNumber;
    private final Integer couponMinPrice;
    private final Integer couponMaxPrice;
}
