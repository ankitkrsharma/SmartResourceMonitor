package exception;

public class CriticalFailureException extends RuntimeException {

    public CriticalFailureException(String msg) {
        super(msg);
    }
}
