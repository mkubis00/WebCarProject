package maciej.kubis.carweb.exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException() {
        super(String.format("NO DATA"));
    }
}
