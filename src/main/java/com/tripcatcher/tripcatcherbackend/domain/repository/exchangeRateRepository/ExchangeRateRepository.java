package com.tripcatcher.tripcatcherbackend.domain.repository.exchangeRateRepository;

import com.tripcatcher.tripcatcherbackend.domain.entity.ExchangeRate;
import com.tripcatcher.tripcatcherbackend.domain.entity.compositeKey.ExchangeRateId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, ExchangeRateId> {
}