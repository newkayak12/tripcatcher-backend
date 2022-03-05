package repository.entity.embedded;

import lombok.*;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserAddress {
    private String userZipCode;
    private String userAddress;
    private String userAddressDetail;
}
