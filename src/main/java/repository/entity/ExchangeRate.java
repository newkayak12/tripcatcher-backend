package repository.entity;

import lombok.*;
import repository.entity.compositeKey.ExchangeRateId;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@Entity
public class ExchangeRate implements Serializable {
    @EmbeddedId
    private ExchangeRateId exchangeRateId;
}
