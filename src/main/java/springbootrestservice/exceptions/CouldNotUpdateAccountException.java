package springbootrestservice.exceptions;

public class CouldNotUpdateAccountException extends RuntimeException {

    public CouldNotUpdateAccountException(final String message, final Throwable cause) {
        super(message, cause);
    }

}
