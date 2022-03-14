package com.tripcatcher.tripcatcherbackend.domain.entity.embedded;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EntityListeners;
import java.time.LocalDateTime;
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
    private LocalDateTime userRegistrationDate;
    @LastModifiedDate
    private LocalDateTime userModifiedDate;
    private LocalDateTime userWithdrawalDate;
    private LocalDateTime userLastSignDate;

}
