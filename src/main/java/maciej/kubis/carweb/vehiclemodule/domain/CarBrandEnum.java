package maciej.kubis.carweb.vehiclemodule.domain;

public enum CarBrandEnum {

    ASTON_MARTIN("Aston Martin"), AUDI("AUDI"), BAC("Bac"), BWM("Bwm"), BUICK("Buick"), CHEVROLET("Chevrolet"),
    FERRARI("Ferrari"), FORD("Ford"), HOONIGAN("Hoonigan"), JAGUAR("Jaguar"), KOENIGSEGG("Koenigsegg"),
    LAMBORGHINI("Lamborghini"), LOTUS("Lotus"), MAZDA("Mazda"), MCLAREN("Mclaren"), MERCEDES_BEZN("Mercedes Benz"),
    MINI("Mini"), MORGAN("Morgan"), NISSAN("Nissan"), PAGANI("Pagani"), PORSHE("Porshe"), RENAULT("Renault"),
    TOYOTA("Toyota"), VOLKSWAGEN("Volkswagen");

    private final String value;

    CarBrandEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
