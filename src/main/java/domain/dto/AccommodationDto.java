package domain.dto;

import domain.entity.enums.AccommodationEnums;
import lombok.Data;

import java.io.Serializable;

@Data
public class AccommodationDto implements Serializable {
    private static final long serialVersionUID = 1265120672260438424L;
    private final Long accommodationNo;
    private final AccommodationEnums.AccommodationCategory accommodationCategory;
    private final AccommodationEnums.AccommodationCategoryDetail accommodationCategoryDetail;
    private final String accommodationNameKR;
    private final String accommodationNameJP;
    private final String accommodationNameEN;
    private final String accommodationPhoneNumber;
    private final String accommodationPhoneNumber2;
    private final AddressDto addressKR;
    private final AddressDto addressJP;
    private final AddressDto addressEN;
    private final AccommodationEnums.State state;
    private final AccommodationEnums.City city;
    private final String accommodationLatitude;
    private final String accommodationLongitude;
    private final String accommodationHomepageLink;
    private final String accommodationDescriptionKR;
    private final String accommodationDescriptionJP;
    private final String accommodationDescriptionEN;
}
