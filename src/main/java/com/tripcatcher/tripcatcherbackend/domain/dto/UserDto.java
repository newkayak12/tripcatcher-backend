package com.tripcatcher.tripcatcherbackend.domain.dto;

import com.tripcatcher.tripcatcherbackend.domain.entity.enums.Locale;
import com.tripcatcher.tripcatcherbackend.domain.entity.enums.UserStatus;
import lombok.*;

import java.io.Serializable;
import java.util.List;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto implements Serializable {
    //    private static final long serialVersionUID = -7040289248738237959L;
    private  Long userNo;
    private  String userId;
    private  String userPassword;
    private  String userNickname;
    private  AddressDto userAddress;
    private  String userPhoneNumber;
    private  String userAccessKey;
    private  UserDateDto date;
    private  UserStatus userStatus;
    private  Locale locale;
    private  List<CouponBoxDto> couponBox;
    private  UserProfileDto userProfile;
    private  List<LikeDto> likes;
    private  List<ReviewDto> reviews;
    private  List<ReportDto> reports;
}
