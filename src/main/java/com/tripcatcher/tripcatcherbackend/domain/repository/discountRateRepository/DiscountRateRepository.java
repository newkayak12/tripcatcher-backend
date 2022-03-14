package com.tripcatcher.tripcatcherbackend.domain.repository.discountRateRepository;

import com.tripcatcher.tripcatcherbackend.domain.entity.DiscountRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRateRepository extends JpaRepository<DiscountRate, Long>, JpaSpecificationExecutor<DiscountRate>, CustomDiscountRateRepository {
}