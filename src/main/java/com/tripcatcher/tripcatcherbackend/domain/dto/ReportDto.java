package com.tripcatcher.tripcatcherbackend.domain.dto;

import com.tripcatcher.tripcatcherbackend.domain.entity.enums.ReportEnums;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class ReportDto implements Serializable {
    private static final long serialVersionUID = 6149307916044343383L;
    private final Long reportNo;
    private final ReviewDto review;
    private final UserDto reporter;
    private final ReportEnums.ReportReason reportReason;
    private final String reportComment;
    private final LocalDateTime reportRegDate;
    private final ReportEnums.ReportStatus reportStatus;
}
