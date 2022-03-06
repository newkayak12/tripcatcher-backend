package repository.entity.converter;

import repository.entity.enums.UserStatus;

import javax.persistence.AttributeConverter;
import java.util.Objects;

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
