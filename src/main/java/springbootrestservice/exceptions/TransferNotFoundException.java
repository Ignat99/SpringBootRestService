package springbootrestservice.exceptions;

public class TransferNotFoundException extends RuntimeException {

    public TransferNotFoundException(final String message) {
        super(message);
    }

}
