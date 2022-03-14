package com.tripcatcher.tripcatcherbackend.domain.dto;

import com.tripcatcher.tripcatcherbackend.domain.entity.enums.CouponStatus;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class CouponBoxDto implements Serializable {
    private static final long serialVersionUID = -2245215777141367597L;
    private final String couponBoxNo;
    private final UserDto user;
    private final CouponDto coupon;
    private final LocalDateTime couponBoxAddedDate;
    private final CouponStatus couponStatus;

}
