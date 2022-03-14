package com.tripcatcher.tripcatcherbackend.domain.repository.discountRateRepository;

import com.tripcatcher.tripcatcherbackend.domain.entity.DiscountRate;

public interface CustomDiscountRateRepository {
    DiscountRate fetchDiscountRate(Long roomNo);
}
