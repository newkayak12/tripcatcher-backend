package com.tripcatcher.tripcatcherbackend.domain.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ExchangeRateDto implements Serializable {
    private static final long serialVersionUID = -9107518388723802673L;
    private final ExchangeRateIdDto exchangeRateId;
}
