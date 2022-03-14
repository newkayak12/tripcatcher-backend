package com.tripcatcher.tripcatcherbackend.domain.entity;

import com.tripcatcher.tripcatcherbackend.domain.entity.converter.ReservationPaymentMethodsConverter;
import com.tripcatcher.tripcatcherbackend.domain.entity.converter.ReservationStatusConverter;
import com.tripcatcher.tripcatcherbackend.domain.entity.enums.ReservationEnums;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationNo;
    @ManyToOne
    @JoinColumn(name = "user_no")
    private User user;
    @OneToOne
    @JoinColumn(name = "room_no")
    private Room room;
    @OneToOne
    @JoinColumn(name = "coupon_no")
    private Coupon coupon;
    @Column(length = 50)
    private String reservationNumber;
    private LocalDateTime reservationRegDate;
    private LocalDateTime reservationStartDate;
    private LocalDateTime reservationEndDate;
    @Column(length = 30)
    private String reservationPersonName;
    @Column(length = 30)
    private String reservationPersonPhoneNumber;
    private Integer reservationPerAdult;
    private Integer reservationPerTeenager;
    private Integer reservationPerKid;
    @Convert(converter = ReservationPaymentMethodsConverter.class)
    private ReservationEnums.ReservationPaymentMethods reservationPaymentMethods;
    @Convert(converter = ReservationStatusConverter.class)
    private ReservationEnums.ReservationStatus reservationStatus;
    private Integer reservationPrice;
}
