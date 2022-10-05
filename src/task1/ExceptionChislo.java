package task1;

public class ExceptionChislo extends Exception{
    private String chislo;

    public String getChislo() {
        return chislo;
    }

    public ExceptionChislo(String massage, String chislo){
        super(massage);
        this.chislo = chislo;
    }
}
