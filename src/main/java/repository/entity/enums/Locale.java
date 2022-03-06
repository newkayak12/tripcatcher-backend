package repository.entity.enums;

import lombok.Getter;

@Getter
public enum Locale {
    KR(1),JP(2),EN(3);

    int code;
    Locale(int code){
        this.code=code;
    }


}
