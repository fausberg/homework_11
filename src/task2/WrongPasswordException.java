package task2;

public class WrongPasswordException extends Exception {

    WrongPasswordException(){}
    public WrongPasswordException(String massage){
        super(massage);
    }
}
