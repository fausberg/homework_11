package task2;

public class WrongPasswordException extends Exception {

    boolean bool = true;

    public boolean isBool() {
        return bool;
    }

    WrongPasswordException(){}
    public WrongPasswordException(String massage, boolean bool){
        super(massage);
        this.bool = bool;
    }
}
