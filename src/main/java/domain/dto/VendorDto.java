package domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class VendorDto implements Serializable {
    private static final long serialVersionUID = 6399503259737223231L;
    private final Long vendorNo;
    private final String vendorId;
    private final String vendorPassword;
    private final String VendorNameKR;
    private final String VendorNameJP;
    private final String VendorNameEN;
    private final String vendorPhoneNumber;
    private final LocalDateTime vendorLastSignDate;
    private final AccommodationDto accommodation;
}
