package task1;

public class StaticMethod {
    public static void xBlock(String d, int x) {
        String xcopy = String.valueOf(x);
        xcopy = xcopy + xcopy + xcopy + xcopy;
        String dcopy = d;
        while (dcopy.contains(xcopy)) {
            System.out.print(xcopy);
            System.out.print(" ");
            dcopy = dcopy.replaceFirst(xcopy, "*");
        }
        System.out.println();
    }

    public static void yReplace(String d, String y) {
        String dcopy = d;
        while (dcopy.contains(y)) {
            dcopy = dcopy.replaceFirst(y, "*");
        }
        System.out.println(dcopy);
    }

    public static String xReplace(String d, int x) {
        String xcopy = String.valueOf(x);
        String dcopy = d;
        if (dcopy.contains("-")) {
            dcopy = dcopy.replace("-", "/");
        }
        while (dcopy.contains(xcopy)) {
            dcopy = dcopy.replaceFirst(xcopy, "");
        }
        if (dcopy.contains("//")) {
            dcopy = dcopy.replace("//", "/");
            dcopy = dcopy.replaceFirst("/", "");
        }
        return dcopy;
    }


    public static void sb(Document document) throws ExceptionDocumentNumber {
        StringBuilder test = new StringBuilder();
        test.append("Letters:").append(xReplace(document.documentNumber(document.getX(), document.getY()), document.getX()));
        String test1 = String.valueOf(test);
        test1 = test1.toUpperCase();
        System.out.println(test1);
    }

    public static void posl(String d) throws ExceptionABC{
        String test = d;
        String test1 = test.toUpperCase();
        if(test.contains("abc") || test1.contains("ABC")){
            System.out.println("Есть");
        }else{
            String massage = "NO";
            String abc = test.substring(0);

            throw new ExceptionABC(massage, abc);
        }
    }

    public static void checkStart(String d) throws ExceptionChislo {
        if(d.startsWith("555")){
            System.out.println("Yes");
        }else{
            String massage = "No";
            String chislo = d.substring(0,3);

            throw new ExceptionChislo(massage,chislo);
        }
    }

    public static void checkEnd(String d) throws Exception1a2b {
        if(d.endsWith("1a2b")){
            System.out.println("Yes");
        }else{
            String massage = "NO";
            String end = d.substring(d.length() - 4);

            throw new Exception1a2b(massage, end);
        }
    }
}
