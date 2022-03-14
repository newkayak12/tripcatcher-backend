package domain.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class FilterDto implements Serializable {
    private static final long serialVersionUID = -965193163608620403L;
    private final Long filterNo;
    private final String filterNameKR;
    private final String filterNameJP;
    private final String filterNameEN;
    private final Integer roomMaxCapacity;
    private final RoomAmenitiesDto amenities;
}
