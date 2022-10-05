package task1;

public class ExceptionDocumentNumber extends Exception{
    private int diff;

    public int getDiff() {
        return diff;
    }

    public ExceptionDocumentNumber(String massage, int diff){
        super(massage);
        this.diff = diff;
    }
}
