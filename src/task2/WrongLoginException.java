package task2;

public class WrongLoginException extends Exception {

    WrongLoginException(){}
    public WrongLoginException(String massage){
        super(massage);
    }
}
