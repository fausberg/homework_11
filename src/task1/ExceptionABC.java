package task1;

public class ExceptionABC extends Exception {
    private String abc;

    public String getAbc() {
        return abc;
    }

    public ExceptionABC(String massage, String abc){
        super(massage);
        this.abc = abc;
    }
}
