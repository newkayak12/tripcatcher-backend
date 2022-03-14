package com.tripcatcher.tripcatcherbackend.domain.entity;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import com.tripcatcher.tripcatcherbackend.domain.entity.embedded.RoomAmenities;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@DynamicInsert
@DynamicUpdate
@Entity
public class Filter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long filterNo;

    @Column(name = "filter_name_KR", length = 300)
    private String filterNameKR;
    @Column(name = "filter_name_JP", length = 300)
    private String filterNameJP;
    @Column(name = "filter_name_EN", length = 300)
    private String filterNameEN;
    private Integer roomMaxCapacity;

    @Embedded
    private RoomAmenities amenities;

}
