package domain.entity;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import domain.entity.embedded.RoomAmenities;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@DynamicInsert
@DynamicUpdate
@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**
     * "방 고유 번호"
     */
    private Long roomNo;
    private Integer roomNumber;
    @Column(length = 50)
    private String roomNameKR;
    @Column(length = 50)
    private String roomNameJP;
    @Column(length = 50)
    private String roomNameEN;
    @Column
    @ColumnDefault("2")
    private Integer roomMinCapacity;
    private Integer roomMaxCapacity;
    private Integer roomCleanUpFee;
    private Integer roomServeFee;
    private Integer roomTax;
    private Integer roomPrice;
    private Integer roomPricePerAdult;
    private Integer roomPricePerTeenager;
    private Integer roomPricePerKid;
    private Integer roomTotalPrice;
    @Temporal(TemporalType.TIME)
    private LocalTime roomCheckInTime;
    @Temporal(TemporalType.TIME)
    private LocalTime roomCheckOutTime;

    @Embedded
    private RoomAmenities amenities;

    @Column(name = "room_information_KR", columnDefinition = "TEXT")
    private String roomInformationKR;

    @Column(name = "room_information_JP", columnDefinition = "TEXT")
    private String roomInformationJP;

    @Column(name = "room_information_EN", columnDefinition = "TEXT")
    private String roomInformationEN;

    @Column(name = "room_structure_KR", length = 300)
    private String roomStructureKR;
    @Column(name = "room_structure_JP", length = 300)
    private String roomStructureJP;
    @Column(name = "room_structure_EN", length = 300)
    private String roomStructureEN;
    @Column(name = "room_size_KR", length = 300)
    private String roomSizeKR;
    @Column(name = "room_size_JP", length = 300)
    private String roomSizeJP;
    @Column(name = "room_size_EN", length = 300)
    private String roomSizeEN;
    @Column(name = "room_description_KR", length = 400)
    private String roomDescriptionKR;
    @Column(name = "room_description_JP", length = 400)
    private String roomDescriptionJP;
    @Column(name = "room_description_EN", length = 400)
    private String roomDescriptionEN;
    private Double roomScore;

    @OneToMany(mappedBy = "room")
    private List<Keywords> keywordsList = new ArrayList<>();
    @OneToMany(mappedBy = "room")
    private List<DiscountRate> discountRateList  = new ArrayList<>();
    @OneToMany(mappedBy = "room")
    private List<RoomImage> roomImages = new ArrayList<>();

}
