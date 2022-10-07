package task2;

public class WrongLoginException extends Exception {

    boolean bool = true;

    public boolean isBool() {
        return bool;
    }

    WrongLoginException(){}
    public WrongLoginException(String massage, boolean bool){
        super(massage);
        this.bool = bool;
    }
}
