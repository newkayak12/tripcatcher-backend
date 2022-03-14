package com.tripcatcher.tripcatcherbackend.domain.entity.converter;

import com.tripcatcher.tripcatcherbackend.domain.entity.enums.BoardType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Objects;
@Converter
public class BoardTypeConverter implements AttributeConverter<BoardType, Integer> {
    @Override
    public Integer convertToDatabaseColumn(BoardType boardType) {
        if(Objects.isNull(boardType)){
            return null;
        }
        return boardType.getCode();
    }

    @Override
    public BoardType convertToEntityAttribute(Integer integer) {
        switch (integer){
            case 1:
                return BoardType.NOTICE;
            case 2:
                return BoardType.EVENT;
            case 3:
                return BoardType.FAQ;
            default:
                return null;
        }
    }
}
