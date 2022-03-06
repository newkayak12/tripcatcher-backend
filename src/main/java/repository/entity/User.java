package repository.entity;

import lombok.*;
import repository.entity.converter.LocaleConverter;
import repository.entity.converter.UserStateConverter;
import repository.entity.embedded.UserAddress;
import repository.entity.embedded.UserDate;
import repository.entity.enums.Locale;
import repository.entity.enums.UserStatus;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userNo;
    private String userId;
    private String userPassword;
    private String userNickname;
    private String userPhoneNumber;
    private String userAccessKey;
    @Embedded
    private UserAddress address;
    @Embedded
    private UserDate date;
    @Convert(converter = UserStateConverter.class)
    private UserStatus userStatus;
    @Convert(converter = LocaleConverter.class)
    private Locale locale;


}
