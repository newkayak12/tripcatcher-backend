package domain.entity;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import domain.entity.converter.AccommodationCategoryConverter;
import domain.entity.converter.AccommodationCategoryDetailConverter;
import domain.entity.converter.AccommodationSearchFilterStateConverter;
import domain.entity.embedded.Address;
import domain.entity.enums.AccommodationEnums;

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
    private AccommodationEnums.AccommodationCategory accommodationCategory;
    @Convert(converter = AccommodationCategoryDetailConverter.class)
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
    private AccommodationEnums.State state;
    @Convert(converter = AccommodationEnums.City.class)
    private AccommodationEnums.City city;
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
