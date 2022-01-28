package maciej.kubis.carweb.exception;

public class ConflictException extends RuntimeException{
    public ConflictException() {
        super(String.format("INVALIDATE DATA"));
    }
}
