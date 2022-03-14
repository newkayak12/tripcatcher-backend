package com.tripcatcher.tripcatcherbackend.domain.entity.converter;

import com.tripcatcher.tripcatcherbackend.domain.entity.enums.ReviewStatus;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Arrays;
import java.util.Objects;
@Converter
public class ReviewStatusConverter implements AttributeConverter<ReviewStatus,Integer> {
    @Override
    public Integer convertToDatabaseColumn(ReviewStatus reviewStatus) {
        if(Objects.isNull(reviewStatus)){
            return null;
        }
        return reviewStatus.getCode();
    }

    @Override
    public ReviewStatus convertToEntityAttribute(Integer integer) {
        return Arrays.stream(ReviewStatus.values()).filter(v->integer.equals(v.getCode())).findFirst().orElse(null);
    }
}
