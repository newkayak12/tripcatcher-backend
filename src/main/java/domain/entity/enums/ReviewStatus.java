package domain.entity.enums;

import lombok.Getter;

@Getter
public enum ReviewStatus {
    SHOW(1), HIDE(0);
    int code;
    ReviewStatus(int code) {
        this.code = code;
    }
}
