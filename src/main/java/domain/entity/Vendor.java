package domain.entity;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@DynamicInsert
@DynamicUpdate
@EqualsAndHashCode
@Entity
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vendorNo;
    @Column(length = 30)
    private String vendorId;
    @Column(length = 300)
    private String vendorPassword;
    @Column(length = 30)
    private String VendorNameKR;
    @Column(length = 30)
    private String VendorNameJP;
    @Column(length = 30)
    private String VendorNameEN;
    @Column(length = 30)
    private String vendorPhoneNumber;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime vendorLastSignDate;
    @OneToOne
    @JoinColumn(name = "accommodation_no")
    private Accommodation accommodation;
}
