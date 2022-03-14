package com.tripcatcher.tripcatcherbackend.domain.entity;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
@DynamicInsert
@DynamicUpdate
@Entity

public class Coupon implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long couponNo;
    @Column(length = 400)
    private String couponName;
    @Column(length = 500)
    private Integer couponDiscountRate;
    private LocalDateTime couponIssuedDate;
    private LocalDateTime couponExpirationDate;
    private Integer couponIssuedNumber;
    private Integer couponMinPrice;
    private Integer couponMaxPrice;



}
