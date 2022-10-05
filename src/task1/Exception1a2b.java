package task1;

public class Exception1a2b extends Exception {
    private String end;

    public String getEnd() {
        return end;
    }

    public Exception1a2b(String massage, String end){
        super(massage);
        this.end = end;
    }
}
