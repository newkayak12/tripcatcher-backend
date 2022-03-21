package com.tripcatcher.tripcatcherbackend.common.exceptions;

import lombok.Getter;

@Getter
public enum ExceptionLanguage {
    PASSWORD_MISMATCH(-1, "비밀번호가 틀렸습니다.", "비밀번호가 틀렸습니다.", "비밀번호가 틀렸습니다."),
    DIFFERENT_IP_ADDRESS(-2, "IP주소가 다릅니다.", "IP주소가 다릅니다.", "IP주소가 다릅니다.");

    Integer code;
    String KR;
    String JP;
    String EN;

    ExceptionLanguage(Integer code, String KR, String JP, String EN) {
        this.code=code;
        this.KR = KR;
        this.JP = JP;
        this.EN = EN;
    }
}
