package com.tripcatcher.tripcatcherbackend.domain.entity;

import com.tripcatcher.tripcatcherbackend.domain.entity.converter.ReviewStatusConverter;
import com.tripcatcher.tripcatcherbackend.domain.entity.enums.ReviewIsRoot;
import com.tripcatcher.tripcatcherbackend.domain.entity.enums.ReviewStatus;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@DynamicInsert
@DynamicUpdate
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_no")
    private Long reviewNo;
    @ManyToOne
    @JoinColumn(name = "user_no")
    private User user;
    @ManyToOne
    @JoinColumn(name = "room_no")
    private Room room;
    @Enumerated(EnumType.ORDINAL)
    private ReviewIsRoot reviewIsRoot;
    @Column(columnDefinition = "TEXT")
    private String reviewComment;
    private LocalDateTime reviewRegDate;
    @ManyToOne
    @JoinColumn(name = "user_ref_no", nullable = true)
    private User userRefNo;
    @Column(updatable = false)
    @ColumnDefault(value = "review_no")
    private Integer reviewNoRef;
    @ColumnDefault(value = "0.0")
    private Double reviewCleanlinessSatisfactionRate;
    @ColumnDefault(value = "0.0")
    private Double reviewKindnessSatisfactionRate;
    @ColumnDefault(value = "0.0")
    private Double reviewServiceSatisfactionRate;
    @ColumnDefault(value = "0.0")
    private Double reviewPricePerSatisfactionRate;
    @ColumnDefault(value = "")
    private Double reviewTotalSatisfactionRate;
    @Convert(converter = ReviewStatusConverter.class)
    private ReviewStatus reviewStatus;

    @PrePersist
    private void totalCalculator(){
        Double total = this.reviewCleanlinessSatisfactionRate
                + this.reviewKindnessSatisfactionRate
                + this.reviewServiceSatisfactionRate
                + this.reviewPricePerSatisfactionRate;
        this.reviewTotalSatisfactionRate = total;

    }
}
