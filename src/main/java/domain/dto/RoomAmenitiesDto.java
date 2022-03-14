package domain.dto;

import domain.entity.enums.Amenities;
import lombok.Data;

import java.io.Serializable;

@Data
public class RoomAmenitiesDto implements Serializable {
    private static final long serialVersionUID = 4926964508519990649L;
    private final Amenities.Parking parking;
    private final Amenities.RoomService roomService;
    private final Amenities.Bathtub bathtub;
    private final Amenities.InnerPool innerPool;
    private final Amenities.OuterPool outerPool;
    private final Amenities.SingleBed singleBed;
    private final Amenities.TwinBed twinBed;
    private final Amenities.DoubleBed doubleBed;
    private final Amenities.Bbq bbq;
    private final Amenities.Spa spa;
    private final Amenities.WhirlPool whirlPool;
    private final Amenities.BeamProjector beamProjector;
    private final Amenities.BluetoothSpeaker bluetoothSpeaker;
    private final Amenities.LoungeChair loungeChair;
    private final Amenities.MassageChair massageChair;
    private final Amenities.Terrace terrace;
    private final Amenities.PickUpService pickUpService;
    private final Amenities.Breakfast breakfast;
    private final Amenities.MountainView mountainView;
    private final Amenities.RiverView riverView;
    private final Amenities.OceanView oceanView;
    private final Amenities.Wifi wifi;
    private final Amenities.HairDryer hairDryer;
    private final Amenities.Shampoo shampoo;
    private final Amenities.Conditioner conditioner;
    private final Amenities.Bidet bidet;
    private final Amenities.WarmWater warmWater;
    private final Amenities.Tv tv;
    private final Amenities.Dishes dishes;
    private final Amenities.WineGlass wineGlass;
    private final Amenities.Washer washer;
    private final Amenities.Dryer dryer;
    private final Amenities.Kitchen kitchen;
    private final Amenities.ShowerGel showerGel;
    private final Amenities.WorkSpace workSpace;
    private final Amenities.CoffeeMachine coffeeMachine;
    private final Amenities.TeleScope teleScope;
    private final Amenities.WithPets withPets;
    private final Amenities.Campfire campfire;
}
