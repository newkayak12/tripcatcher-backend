package repository.entity;

import lombok.*;
import repository.entity.converter.LocaleConverter;
import repository.entity.converter.UserStateConverter;
import repository.entity.embedded.Address;
import repository.entity.embedded.UserDate;
import repository.entity.enums.Locale;
import repository.entity.enums.UserStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode

public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userNo;
    @Column(length = 30)
    private String userId;
    @Column(length = 300)
    private String userPassword;
    @Column(length = 40)
    private String userNickname;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "zipCode", column = @Column(name = "user_zipcode")),
            @AttributeOverride(name = "address", column = @Column(name = "user_address")),
            @AttributeOverride(name = "addressDetail", column = @Column(name = "user_address_detail"))
    })
    private Address userAddress;
    @Column(length = 30)
    private String userPhoneNumber;
    @Column(length = 200)
    private String userAccessKey;
    @Embedded
    private UserDate date;
    @Convert(converter = UserStateConverter.class)
    private UserStatus userStatus;
    @Convert(converter = LocaleConverter.class)
    private Locale locale;
    @OneToMany(mappedBy = "user")
    private List<CouponBox> couponBox = new ArrayList<>();
    @OneToOne(mappedBy = "user")
    private UserProfile userProfile;



}
