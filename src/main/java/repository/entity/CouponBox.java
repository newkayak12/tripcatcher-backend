package repository.entity;

import lombok.*;
import repository.entity.converter.CouponStatusConverter;
import repository.entity.enums.CouponStatus;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@Entity
public class CouponBox {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String couponBoxNo;
    @ManyToOne
    @JoinColumn(name = "user_no")
    private User user;
    @OneToOne
    @JoinColumn(name = "coupon_no")
    private Coupon coupon;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime couponBoxAddedDate;
    @Convert(converter = CouponStatusConverter.class)
    private CouponStatus couponStatus;
}
