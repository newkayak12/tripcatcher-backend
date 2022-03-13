package domain.entity.enums;

import lombok.Getter;

@Getter
public enum BoardIsBanner {
    GENERAL(0), BANNER(1);
    int code;
    BoardIsBanner(int code){
        this.code = code;
    }
}
