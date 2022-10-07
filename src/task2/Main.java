package task2;

public class Main {
    public static void main(String[] args) {
        try {
            StaticMethod.signIn("fausberg", "password2","password2");
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
            System.out.println(e.isBool());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
            System.out.println(e.isBool());
        }
    }
}
