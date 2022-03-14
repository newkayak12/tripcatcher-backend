package com.tripcatcher.tripcatcherbackend.domain.entity;

import com.tripcatcher.tripcatcherbackend.domain.entity.converter.AccommodationCategoryConverter;
import com.tripcatcher.tripcatcherbackend.domain.entity.converter.AccommodationCategoryDetailConverter;
import com.tripcatcher.tripcatcherbackend.domain.entity.converter.AccommodationSearchFilterCityConverter;
import com.tripcatcher.tripcatcherbackend.domain.entity.converter.AccommodationSearchFilterStateConverter;
import com.tripcatcher.tripcatcherbackend.domain.entity.embedded.Address;
import com.tripcatcher.tripcatcherbackend.domain.entity.enums.AccommodationEnums;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
@EqualsAndHashCode
@Entity
public class Accommodation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accommodationNo;
    @Convert(converter = AccommodationCategoryConverter.class)
    @Enumerated
    private AccommodationEnums.AccommodationCategory accommodationCategory;
    @Convert(converter = AccommodationCategoryDetailConverter.class)
    @Enumerated
    private AccommodationEnums.AccommodationCategoryDetail accommodationCategoryDetail;
    @Column(length = 40, name = "accommodation_name_KR")
    private String accommodationNameKR;
    @Column(length = 40, name = "accommodation_name_JP")
    private String accommodationNameJP;
    @Column(length = 40, name = "accommodation_name_EN")
    private String accommodationNameEN;
    @Column(length = 40)
    private String accommodationPhoneNumber;
    @Column(length = 40)
    private String accommodationPhoneNumber2;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "zipCode", column = @Column(name = "accommodation_zipcode_KR")),
            @AttributeOverride(name = "address", column = @Column(name = "accommodation_address_KR")),
            @AttributeOverride(name = "addressDetail", column = @Column(name = "accommodation_detail_KR"))
    })
    private Address addressKR;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "zipCode", column = @Column(name = "accommodation_zipcode_JP")),
            @AttributeOverride(name = "address", column = @Column(name = "accommodation_address_JP")),
            @AttributeOverride(name = "addressDetail", column = @Column(name = "accommodation_detail_JP"))
    })
    private Address addressJP;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "zipCode", column = @Column(name = "accommodation_zipcode_EN")),
            @AttributeOverride(name = "address", column = @Column(name = "accommodation_address_EN")),
            @AttributeOverride(name = "addressDetail", column = @Column(name = "accommodation_detail_EN"))
    })
    private Address addressEN;
    @Convert(converter = AccommodationSearchFilterStateConverter.class)
    @Enumerated
    private AccommodationEnums.State accommodationState;
    @Convert(converter = AccommodationSearchFilterCityConverter.class)
    @Enumerated
    private AccommodationEnums.City accommodationCity;
    @Column(length = 30)
    private String accommodationLatitude;
    @Column(length = 30)
    private String accommodationLongitude;
    @Column(length = 100)
    private String accommodationHomepageLink;
    @Column(columnDefinition = "TEXT", name = "accommodation_description_KR")
    private String accommodationDescriptionKR;
    @Column(columnDefinition = "TEXT", name = "accommodation_description_JP")
    private String accommodationDescriptionJP;
    @Column(columnDefinition = "TEXT", name = "accommodation_description_EN")
    private String accommodationDescriptionEN;
}
