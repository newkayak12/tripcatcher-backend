package com.tripcatcher.tripcatcherbackend.domain.entity;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@DynamicInsert
@DynamicUpdate
@Entity
public class DiscountRate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long discountRateNo;
    @ManyToOne
    @JoinColumn(name = "room_no")
    private Room room;
    private Integer discountRate;
    private LocalDateTime discountRateStartDate;
    private LocalDateTime discountRateEndDate;

}
