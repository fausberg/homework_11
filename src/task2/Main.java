package task2;

public class Main {
    public static void main(String[] args) {
        try {
            StaticMethod.signIn("fausberg", "password","password");
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
