package domain.entity.enums;

import lombok.Getter;

@Getter
public enum UserStatus {
    INACTIVE(0),ACTIVE(1);
    int code;
    UserStatus(int code){
        this.code = code;
    }
}
