package com.tripcatcher.tripcatcherbackend.domain.entity.enums;

import lombok.Getter;

public interface ReportEnums {
    @Getter
    enum ReportReason{
        INAPPROPRIATE_CONTENT(1),
        ADVERTISING_MESSAGE(2),
        REPEATED_POSTING(3),
        OTHER_THINGS(4);
        int code;
        ReportReason(int code) {
            this.code = code;
        }
    }
    @Getter
    enum ReportStatus{
        RECEIVED(1), OPERATED(2);
        int code;
        ReportStatus(int code) {
            this.code = code;
        }
    }
}
