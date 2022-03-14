package com.tripcatcher.tripcatcherbackend.domain.entity.converter;

import com.tripcatcher.tripcatcherbackend.domain.entity.enums.ReportEnums;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Arrays;
import java.util.Objects;
@Converter
public class ReportReasonConverter implements AttributeConverter<ReportEnums.ReportReason, Integer> {
    @Override
    public Integer convertToDatabaseColumn(ReportEnums.ReportReason reportReason) {
        if(Objects.isNull(reportReason)){
            return null;
        }
        return reportReason.getCode();
    }

    @Override
    public ReportEnums.ReportReason convertToEntityAttribute(Integer integer) {
        return Arrays.stream(ReportEnums.ReportReason.values()).filter(v->integer.equals(v.getCode())).findFirst().orElse(null);
    }
}
