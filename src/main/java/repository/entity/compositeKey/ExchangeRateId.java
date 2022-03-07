package repository.entity.compositeKey;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ExchangeRateId implements Serializable {
    private Integer KRW;
    private Integer YEN;
    private Integer DOLLAR;
}
