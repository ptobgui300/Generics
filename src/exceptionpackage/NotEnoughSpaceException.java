package exceptionpackage;

public class NotEnoughSpaceException extends RuntimeException {

	public NotEnoughSpaceException(String message) {
		super(message);
	}
}