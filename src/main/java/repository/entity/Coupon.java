package repository.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
@Entity

public class Coupon implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long couponNo;
    @Column(length = 400)
    private String couponName;
    @Column(length = 500)
    private Integer couponDiscountRate;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime couponIssuedDate;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime couponExpirationDate;
    private Integer couponIssuedNumber;
    private Integer couponMinPrice;
    private Integer couponMaxPrice;



}
