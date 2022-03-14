package com.tripcatcher.tripcatcherbackend.domain.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ExchangeRateIdDto implements Serializable {
    private static final long serialVersionUID = -8193035950019975743L;
    private final Integer KRW;
    private final Integer YEN;
    private final Integer DOLLAR;
}
