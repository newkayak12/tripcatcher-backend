package repository.entity.enums;

import lombok.Getter;


public interface AccommodationEnums {
    @Getter
    enum AccommodationCategory{
        HOTEL(1),PENSION_POOL_VILLA(2)
        ,MOTEL(3),RESORT(4)
        ,GUEST_HOUSE_KOREA_TRADITIONAL(5)
        ,RESIDENT(6);
        int code;
        AccommodationCategory(int code){
            this.code = code;
        }
    }
    @Getter
    enum AccommodationCategoryDetail{
        //호텔
        ONE_STAR_HOTEL(1), TWO_STAR_HOTEL(2), THREE_STAR_HOTEL(3),FOUR_STAR_HOTEL(4), FIVE_STAR_HOTEL(5),
        //풀빌라
        UNSHARED_HOUSE(6), PREMIUM_PENSION(7), PRIVATE_POOL_VILLA(8), PUBLIC_POOL_VILLA(9),WITH_PETS_VILLA(10),
        //모텔
        RENTAL(11), PARTY_ROOM_MOTEL(12),SINGING_ROOM_MOTEL(13), CINEMA_ROOM_MOTEL(15),
        //리조트
        SKI_RESORT(16), SPA_RESORT(17), SEA_SIDE_RESORT(18), WATER_PARK_RESORT(19), THEME_PARK_RESORT(20),CASINO_RESORT(21),
        //게스트 하우스/ 한옥
        KOREA_TRADITIONAL(22), STAY(23),
        //글램핑/캠핑장
        CARAVAN(24), GLAMPING(25);
        int code;
        AccommodationCategoryDetail(int code){
            this.code = code;
        }
    }

    @Getter
    enum State{
        SEOUL(1), BUSAN(2),
        DAEGU(3), INCHEON(4),
        GWANGJU(5), DAEJEON(6),
        ULSAN(7), GYEONGGIDO(8),
        GANGWONDO(9), CHUNGCHUNGBUKDO(10),
        CHUNCHUNGNAMDO(11),JEONLABUKDO(12),
        JEONLANAMDO(13),GYEONGSANGBUKDO(14),
        GYEONGSANGNAMDO(15),JEJU(16);
        int code;
        State(int code){
            this.code=code;
        }
    }
    @Getter
    enum City{
        SUWON( 1),SEONGNAM( 2),YONGIN( 3),ANYANG( 4),ANSAN( 5),
        GWACHEON( 6), GWANGMYEONG( 7),GWANGJU( 8),GUNPO( 9), BUCHEON(10),
        SIHEUNG(11), GIMPO(12), ANSEONG(13), OSAN(14), UIWANG(15),
        ICHEON(16), PYEONGTAEK(17), HANAM(18), HWASEONG(19),  YEOJU(20),
        YANGPYEONG(21),GOYANG(22),  GURI(23), NAMYANGJU(24), DONGDUCHEON(25),
        YANGJU(26),  UIJEONGBU(27),  PAJU(28),  POCHEON(29),CHEOLWON(30),
        HWACHEON(31), YANGGU(32), GOSEONG(33), CHUNCHEON(34), INJE(35),
        SOKCHO(36), HONGCHEON(37), YANGYANG(38), HENGSEONG(39), PYEONGCHANG(40),
        GANGNEUNG(41), WONJU(42), YEONGWOL(43), JUNGSEON(44), DONGHAE(45),
        TAEBAEK(46), SAMCHEONG(47), CHEONGJU(48),  HEUNGDEOK(49),  CHUNGJU(50),
        CHEONGWON(51),  SANGDANG(52),  SEOWON(53),  JECHEON(54),  EUMSEONG(55),
        JINCHEON(56),  OKCHEON(57),  YEONGDONG(58),  GOESAN(59),  JEUNGPYEONG(60),
        BOEUN(61),  DANYANG(62),  CHEONAN(63),  ASAN(64),  SEOSAN(65),
        BORYEONG(66),  JEONJU(67),  IKSAN(68),  GUNSAN(69),  JEONGEUP(70),
        GIMJE(71),  NAMWON(72),  GOCHANG(73),  IMSIL(74),  MUJU(75),
        MOKPO(76), MUAN(77), DAMYANG(78), YEOSU(79), HAMPYEONG(80),
        YEONGGWANG(81), GOHEUNG(82), BOSEONG(83), GURYE(84), SUNCHEON(85),
        GYEONGJU(86),  YEONGDEOK(87),  CHANGNYEONG(88),  HADONG(89),  TONGYEONG(90),
        JINJU(91);

        int code;
        City(int code){
            this.code = code;
        }
    }
}
