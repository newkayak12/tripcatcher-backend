package com.tripcatcher.tripcatcherbackend.domain.entity;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
import com.tripcatcher.tripcatcherbackend.domain.entity.compositeKey.ExchangeRateId;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@DynamicUpdate
@Entity
public class ExchangeRate implements Serializable {
    @EmbeddedId
    private ExchangeRateId exchangeRateId;
}
