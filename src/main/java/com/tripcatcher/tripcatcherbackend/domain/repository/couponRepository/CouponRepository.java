package com.tripcatcher.tripcatcherbackend.domain.repository.couponRepository;

import com.tripcatcher.tripcatcherbackend.domain.entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon, Long> {
}