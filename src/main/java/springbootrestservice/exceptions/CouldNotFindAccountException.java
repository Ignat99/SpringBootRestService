package springbootrestservice.exceptions;

public class CouldNotFindAccountException extends RuntimeException {

    public CouldNotFindAccountException(final String message, final Throwable cause) {
        super(message, cause);
    }

}
