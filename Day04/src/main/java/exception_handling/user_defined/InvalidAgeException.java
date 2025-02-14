package exception_handling.user_defined;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg){
        super(msg);
    }
}
