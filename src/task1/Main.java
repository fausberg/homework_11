package task1;

public class Main {
    public static void main(String[] args) throws ExceptionDocumentNumber {
        int x = 2;
        try {
            MyException.x(x);
            System.out.println("OK");
        }catch (ExceptionDocumentNumber e){
            System.out.println(e.getMessage());
            System.out.println(e.getDiff());
        }
        Document document = new Document(x, "r");
        document.documentNumber(document.getX(), document.getY());
        StaticMethod.xBlock(document.documentNumber(document.getX(), document.getY()), document.getX());
        StaticMethod.yReplace(document.documentNumber(document.getX(), document.getY()), document.getY());
        System.out.println(StaticMethod.xReplace(document.documentNumber(document.getX(), document.getY()), document.getX()));
        StaticMethod.sb(document);
        try {
            StaticMethod.posl(document.documentNumber(document.getX(), document.getY()));
            System.out.println("OK");
        }catch (ExceptionABC e){
            System.out.println(e.getMessage());
            System.out.println(e.getAbc());
        }
        try {
            StaticMethod.checkStart(document.documentNumber(document.getX(), document.getY()));
            System.out.println("Хорошо");
        }catch (ExceptionChislo e){
            System.out.println(e.getMessage());
            System.out.println(e.getChislo());
        }
        try {
            StaticMethod.checkEnd(document.documentNumber(document.getX(), document.getY()));
            System.out.println("OK");
        }catch (Exception1a2b e){
            System.out.println(e.getMessage());
            System.out.println(e.getEnd());
        }
    }
}