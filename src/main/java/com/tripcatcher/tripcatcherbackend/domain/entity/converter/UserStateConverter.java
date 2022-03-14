package com.tripcatcher.tripcatcherbackend.domain.entity.converter;

import com.tripcatcher.tripcatcherbackend.domain.entity.enums.UserStatus;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Objects;
@Converter
public class UserStateConverter implements AttributeConverter<UserStatus,Integer> {
    @Override
    public Integer convertToDatabaseColumn(UserStatus userStatus) {
        if(Objects.isNull(userStatus)){
            return null;
        }
        return userStatus.getCode();
    }

    @Override
    public UserStatus convertToEntityAttribute(Integer integer) {
        switch (integer){
            case 0:
                return UserStatus.INACTIVE;
            case 1:
                return UserStatus.ACTIVE;
            default:
                return null;
        }
    }
}
