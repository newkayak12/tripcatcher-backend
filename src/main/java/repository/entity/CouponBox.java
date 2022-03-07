package repository.entity;

import lombok.*;

import javax.persistence.*;

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
    private Long couponBoxNumber;
    @OneToOne
    @JoinColumn(name = "user_no")
    private User user;
}
