package maciej.kubis.carweb.vehiclemodule.domain;

public enum CarTypeEnum {

    ASTON_MARTIN("Aston Martin"), AUDI("AUDI"), BAC("Bac"); // DO ZMIANY

    private final String value;

    CarTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
