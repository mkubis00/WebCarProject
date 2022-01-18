package maciej.kubis.carweb.vehicleModule.domain;

public enum CarBrandEnum {

    ASTON_MARTIN("Aston Martin"), AUDI("AUDI"), BAC("Bac");

    private final String value;

    CarBrandEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
