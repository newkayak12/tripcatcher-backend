package com.tripcatcher.tripcatcherbackend.domain.entity.converter;

import com.tripcatcher.tripcatcherbackend.domain.entity.enums.ReportEnums;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Arrays;
import java.util.Objects;
@Converter
public class ReportStatusConverter implements AttributeConverter<ReportEnums.ReportStatus, Integer> {
    @Override
    public Integer convertToDatabaseColumn(ReportEnums.ReportStatus reportStatus) {
        if(Objects.isNull(reportStatus)){
            return null;
        }
        return reportStatus.getCode();
    }

    @Override
    public ReportEnums.ReportStatus convertToEntityAttribute(Integer integer) {
        return Arrays.stream(ReportEnums.ReportStatus.values())
                .filter(v->integer.equals(v.getCode()))
                .findFirst()
                .orElse(null);
    }
}
