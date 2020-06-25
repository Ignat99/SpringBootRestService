package springbootrestservice.exceptions;

public class CouldNotFindTransferException extends RuntimeException {

    public CouldNotFindTransferException(final String message, final Throwable cause) {
        super(message, cause);
    }

}
