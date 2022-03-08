package repository.entity.enums;

import lombok.Getter;

@Getter
public enum BoardType {
    NOTICE(1), EVENT(2), FAQ(3);
    int code;
    BoardType(int code){
        this.code = code;
    }
}
