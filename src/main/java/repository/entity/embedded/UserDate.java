package repository.entity.embedded;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EntityListeners;
import java.util.Date;
@EntityListeners(AuditingEntityListener.class)
@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDate {
    @CreatedDate
    @Column(updatable = false)
    private Date userRegistrationDate;
    @LastModifiedDate
    private Date userModifiedDate;
    private Date userWithdrawalDate;
    private Date userLastSignDate;
}
