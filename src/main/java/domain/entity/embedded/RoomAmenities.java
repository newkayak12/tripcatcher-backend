package domain.entity.embedded;

import lombok.*;
import domain.entity.enums.Amenities;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


@Embeddable
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class RoomAmenities {
    @Enumerated(EnumType.STRING)
    private Amenities.Parking parking;

    @Enumerated(EnumType.STRING)
    private Amenities.RoomService roomService;

    @Enumerated(EnumType.STRING)
    private Amenities.Bathtub bathtub;

    @Enumerated(EnumType.STRING)
    private Amenities.InnerPool innerPool;

    @Enumerated(EnumType.STRING)
    private Amenities.OuterPool outerPool;

    @Enumerated(EnumType.STRING)
    private Amenities.SingleBed singleBed;

    @Enumerated(EnumType.STRING)
    private Amenities.TwinBed twinBed;

    @Enumerated(EnumType.STRING)
    private Amenities.DoubleBed doubleBed;

    @Enumerated(EnumType.STRING)
    private Amenities.Bbq bbq;

    @Enumerated(EnumType.STRING)
    private Amenities.Spa spa;

    @Enumerated(EnumType.STRING)
    private Amenities.WhirlPool whirlPool;

    @Enumerated(EnumType.STRING)
    private Amenities.BeamProjector beamProjector;

    @Enumerated(EnumType.STRING)
    private Amenities.BluetoothSpeaker bluetoothSpeaker;

    @Enumerated(EnumType.STRING)
    private Amenities.LoungeChair loungeChair;

    @Enumerated(EnumType.STRING)
    private Amenities.MassageChair massageChair;

    @Enumerated(EnumType.STRING)
    private Amenities.Terrace terrace;

    @Enumerated(EnumType.STRING)
    private Amenities.PickUpService pickUpService;

    @Enumerated(EnumType.STRING)
    private Amenities.Breakfast breakfast;

    @Enumerated(EnumType.STRING)
    private Amenities.MountainView mountainView;

    @Enumerated(EnumType.STRING)
    private Amenities.RiverView riverView;

    @Enumerated(EnumType.STRING)
    private Amenities.OceanView oceanView;

    @Enumerated(EnumType.STRING)
    private Amenities.Wifi wifi;

    @Enumerated(EnumType.STRING)
    private Amenities.HairDryer hairDryer;

    @Enumerated(EnumType.STRING)
    private Amenities.Shampoo shampoo;

    @Enumerated(EnumType.STRING)
    private Amenities.Conditioner conditioner;

    @Enumerated(EnumType.STRING)
    private Amenities.Bidet bidet;

    @Enumerated(EnumType.STRING)
    private Amenities.WarmWater warmWater;

    @Enumerated(EnumType.STRING)
    private Amenities.Tv tv;

    @Enumerated(EnumType.STRING)
    private Amenities.Dishes  dishes;

    @Enumerated(EnumType.STRING)
    private Amenities.WineGlass  wineGlass;

    @Enumerated(EnumType.STRING)
    private Amenities.Washer  washer;

    @Enumerated(EnumType.STRING)
    private Amenities.Dryer  dryer;

    @Enumerated(EnumType.STRING)
    private Amenities.Kitchen  kitchen;

    @Enumerated(EnumType.STRING)
    private Amenities.ShowerGel  showerGel;

    @Enumerated(EnumType.STRING)
    private Amenities.WorkSpace  workSpace;

    @Enumerated(EnumType.STRING)
    private Amenities.CoffeeMachine  coffeeMachine;

    @Enumerated(EnumType.STRING)
    private Amenities.TeleScope  teleScope;

    @Enumerated(EnumType.STRING)
    private Amenities.WithPets  withPets;

    @Enumerated(EnumType.STRING)
    private Amenities.Campfire  campfire;
}
