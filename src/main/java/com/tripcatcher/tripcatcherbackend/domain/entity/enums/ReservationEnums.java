package com.tripcatcher.tripcatcherbackend.domain.entity.enums;

import lombok.Getter;

public interface ReservationEnums {
    @Getter
    enum ReservationStatus{
        RESERVED(1), FINISH(2);

        int code;
        ReservationStatus(int code) {
            this.code = code;
        }
    }
    @Getter
    enum ReservationPaymentMethods{
        CARD(1), KAKAO(2), NAVER(3), PAYCO(4);
        int code;
        ReservationPaymentMethods(int code) {
            this.code = code;
        }
    }
}
