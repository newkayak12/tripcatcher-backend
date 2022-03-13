package domain.entity;

import domain.entity.converter.LocaleConverter;
import domain.entity.converter.UserStateConverter;
import domain.entity.embedded.Address;
import domain.entity.embedded.UserDate;
import domain.entity.enums.Locale;
import domain.entity.enums.UserStatus;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
@DynamicUpdate
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
    @OneToMany(mappedBy = "user")
    private List<Like> likes = new ArrayList<>();
    @OneToMany(mappedBy = "user")
    private List<Review> reviews = new ArrayList();
    @OneToMany(mappedBy = "reporter")
    private List<Report> reports = new ArrayList<>();



}
