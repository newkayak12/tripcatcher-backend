package domain.repository.exchangeRateRepository;

import domain.entity.ExchangeRate;
import domain.entity.compositeKey.ExchangeRateId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, ExchangeRateId> {
}