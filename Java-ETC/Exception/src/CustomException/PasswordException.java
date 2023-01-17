package CustomException;

public class PasswordException extends IllegalArgumentException{
    public PasswordException(String message) {
        super(message);
    }
}
