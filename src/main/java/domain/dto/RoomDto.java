package domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;

@Data
public class RoomDto implements Serializable {
    private static final long serialVersionUID = -3713083340517180173L;
    private final Long roomNo;
    private final Integer roomNumber;
    private final String roomNameKR;
    private final String roomNameJP;
    private final String roomNameEN;
    private final Integer roomMinCapacity;
    private final Integer roomMaxCapacity;
    private final Integer roomCleanUpFee;
    private final Integer roomServeFee;
    private final Integer roomTax;
    private final Integer roomPrice;
    private final Integer roomPricePerAdult;
    private final Integer roomPricePerTeenager;
    private final Integer roomPricePerKid;
    private final Integer roomTotalPrice;
    private final LocalTime roomCheckInTime;
    private final LocalTime roomCheckOutTime;
    private final RoomAmenitiesDto amenities;
    private final String roomInformationKR;
    private final String roomInformationJP;
    private final String roomInformationEN;
    private final String roomStructureKR;
    private final String roomStructureJP;
    private final String roomStructureEN;
    private final String roomSizeKR;
    private final String roomSizeJP;
    private final String roomSizeEN;
    private final String roomDescriptionKR;
    private final String roomDescriptionJP;
    private final String roomDescriptionEN;
    private final Double roomScore;
    private final List<KeywordsDto> keywordsList;
    private final List<DiscountRateDto> discountRateList;
    private final List<RoomImageDto> roomImages;
}
