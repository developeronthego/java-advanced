package advanced.lesson8;

public class NotEnoughFundsException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public NotEnoughFundsException(String errorMessage) {
        super(errorMessage);
    }
}
