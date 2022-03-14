package com.tripcatcher.tripcatcherbackend.domain.entity.converter;

import com.tripcatcher.tripcatcherbackend.domain.entity.enums.BoardIsBanner;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Objects;
@Converter
public class BoardIsBannerConverter implements AttributeConverter<BoardIsBanner, Integer> {

    @Override
    public Integer convertToDatabaseColumn(BoardIsBanner boardIsBanner) {
        if(Objects.isNull(boardIsBanner)){
            return null;
        }
        return boardIsBanner.getCode();
    }

    @Override
    public BoardIsBanner convertToEntityAttribute(Integer integer) {
        switch (integer){
            case 0:
                return BoardIsBanner.GENERAL;
            case 1:
                return BoardIsBanner.BANNER;
            default:
                return null;
        }
    }
}
