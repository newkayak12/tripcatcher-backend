package com.tripcatcher.tripcatcherbackend.domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class DiscountRateDto implements Serializable {
    private static final long serialVersionUID = 3794101315488770870L;
    private final Long discountRateNo;
    private final RoomDto room;
    private final Integer discountRate;
    private final LocalDateTime discountRateStartDate;
    private final LocalDateTime discountRateEndDate;
}
