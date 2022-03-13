package domain.dto;

import domain.entity.enums.ReservationEnums;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class ReservationDto implements Serializable {
    private static final long serialVersionUID = -7074582172339125159L;
    private final Long reservationNo;
    private final UserDto user;
    private final RoomDto room;
    private final CouponDto coupon;
    private final String reservationNumber;
    private final LocalDateTime reservationRegDate;
    private final LocalDateTime reservationStartDate;
    private final LocalDateTime reservationEndDate;
    private final String reservationPersonName;
    private final String reservationPersonPhoneNumber;
    private final Integer reservationPerAdult;
    private final Integer reservationPerTeenager;
    private final Integer reservationPerKid;
    private final ReservationEnums.ReservationPaymentMethods reservationPaymentMethods;
    private final ReservationEnums.ReservationStatus reservationStatus;
    private final Integer reservationPrice;
}
