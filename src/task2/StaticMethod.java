package task2;

public class StaticMethod {

    public static void signIn(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException{
        boolean boolLogin;
        boolean boolPassword;
        if(login.length()>20) {
            String massage = "Login > 20";
            boolLogin = false;
            throw new WrongLoginException(massage, boolLogin);
        }else if(password.length()>20){
            String massagepassword = "Password > 20";
            boolPassword = false;
            throw new WrongPasswordException(massagepassword, boolPassword);
        }else if(!password.equals(confirmPassword)) {
            String massagepassword = "Password != confirmPassword";
            boolPassword = false;
            throw new WrongPasswordException(massagepassword, boolPassword);
        }else{
            System.out.println("OK");
        }
        String[] number = password.split("");
        for(int i = 0; i < number.length; i++){
            try {
                int value = Integer.valueOf(number[i]);
                String massage = "Есть число";
                boolPassword = true;
                throw new WrongPasswordException(massage, boolPassword);
            }catch (NumberFormatException e){
                e.getMessage();
            }
        }
    }
}
