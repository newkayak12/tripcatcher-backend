package domain.entity;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
import domain.entity.converter.CouponStatusConverter;
import domain.entity.enums.CouponStatus;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@DynamicUpdate
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
