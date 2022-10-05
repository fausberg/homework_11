package task1;

public class MyException extends Exception {
    public static void x(int x) throws ExceptionDocumentNumber{
        if(x / 10 > 0){
            String massage = "invalid x";
            int diff = x;

            throw new ExceptionDocumentNumber(massage, diff);
        }
    }
}
