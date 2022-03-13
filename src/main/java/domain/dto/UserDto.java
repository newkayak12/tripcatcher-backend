package domain.dto;

import domain.entity.enums.Locale;
import domain.entity.enums.UserStatus;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class UserDto implements Serializable {
    private static final long serialVersionUID = -7040289248738237959L;
    private final Long userNo;
    private final String userId;
    private final String userPassword;
    private final String userNickname;
    private final AddressDto userAddress;
    private final String userPhoneNumber;
    private final String userAccessKey;
    private final UserDateDto date;
    private final UserStatus userStatus;
    private final Locale locale;
    private final List<CouponBoxDto> couponBox;
    private final UserProfileDto userProfile;
    private final List<LikeDto> likes;
    private final List<ReviewDto> reviews;
    private final List<ReportDto> reports;
}
