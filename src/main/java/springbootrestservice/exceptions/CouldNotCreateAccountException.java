package springbootrestservice;

public class CouldNotCreateAccountException extends RuntimeException {

    public CouldNotCreateAccountException(final String message, final Throwable cause) {
        super(message, cause);
    }

}
