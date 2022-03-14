package com.tripcatcher.tripcatcherbackend.domain.repository.discountRateRepository;

import com.tripcatcher.tripcatcherbackend.domain.entity.DiscountRate;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.time.LocalDateTime;

import static com.tripcatcher.tripcatcherbackend.domain.entity.QDiscountRate.discountRate1;


public class CustomDiscountRateRepositoryImpl extends QuerydslRepositorySupport implements CustomDiscountRateRepository {
    public CustomDiscountRateRepositoryImpl() {
        super(DiscountRate.class);
    }

    @Override
    public DiscountRate fetchDiscountRate(Long roomNo) {
        LocalDateTime now = LocalDateTime.now();
        return from(discountRate1)
                .where(discountRate1.room.roomNo.eq(roomNo)
                        .and(discountRate1.discountRateStartDate.goe(now))
                        .and(discountRate1.discountRateEndDate.loe(now)))
                .fetchOne();


    }
}
