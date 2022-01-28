package maciej.kubis.carweb.vehiclemodule.domain;

public enum CarTypeEnum {

    BUGGIES("Buggies"), CLASS_SPORT_CARS("Classic Sports Cars"), CLASSIC_MUSCLE("Classic Muscle"), DRIFT_CARS("Drift Cars"),
    RALLY_MONSTERS("Rally Monsters"), RETRO_SUPER_CARS("Retro Super Cars"), SUPER_GT ("Super GT"), TRACK_TOYS("Track Toys"),
    TRUCKS("Trucks"), HYPERCARS("Hypercars"), HOT_HATCH("Hot Hatch"), MORDER_MUSCLE("Modern Muscle"), OFFROAD("Offroad"),
    VINTAGE_RACERS("Vintage Racers"), VANS_UTILITY("Vans & Utility"),  UTS("UTV's"),  UNLIMITED_OFFROAD("Unlimited Offroad"),
    UNLIMITED_BUGGIES("Unlimited Buggies");

    private final String value;

    CarTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
