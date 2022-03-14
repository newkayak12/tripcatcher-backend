package com.tripcatcher.tripcatcherbackend.domain.entity;

import com.tripcatcher.tripcatcherbackend.domain.entity.converter.ReportReasonConverter;
import com.tripcatcher.tripcatcherbackend.domain.entity.converter.ReportStatusConverter;
import com.tripcatcher.tripcatcherbackend.domain.entity.enums.ReportEnums;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@DynamicInsert
@DynamicUpdate
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Report implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reportNo;
    @OneToOne
    @JoinColumn(name = "review_no")
    private Review review;
    @ManyToOne
    @JoinColumn(name = "user_no")
    private User reporter;
    @Convert(converter = ReportReasonConverter.class)
    private ReportEnums.ReportReason reportReason;
    @Column(columnDefinition = "TEXT")
    private String reportComment;
    @CreatedDate
    private LocalDateTime reportRegDate;
    @Convert(converter = ReportStatusConverter.class)
    private ReportEnums.ReportStatus reportStatus;
}
