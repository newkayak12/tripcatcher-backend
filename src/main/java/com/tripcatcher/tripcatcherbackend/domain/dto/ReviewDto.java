package com.tripcatcher.tripcatcherbackend.domain.dto;

import com.tripcatcher.tripcatcherbackend.domain.entity.enums.ReviewIsRoot;
import com.tripcatcher.tripcatcherbackend.domain.entity.enums.ReviewStatus;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class ReviewDto implements Serializable {
    private static final long serialVersionUID = 818165948574972938L;
    private final Long reviewNo;
    private final UserDto user;
    private final RoomDto room;
    private final ReviewIsRoot reviewIsRoot;
    private final String reviewComment;
    private final LocalDateTime reviewRegDate;
    private final UserDto userRefNo;
    private final Integer reviewNoRef;
    private final Double reviewCleanlinessSatisfactionRate;
    private final Double reviewKindnessSatisfactionRate;
    private final Double reviewServiceSatisfactionRate;
    private final Double reviewPricePerSatisfactionRate;
    private final Double reviewTotalSatisfactionRate;
    private final ReviewStatus reviewStatus;
}
