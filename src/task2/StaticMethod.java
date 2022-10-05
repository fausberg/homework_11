package task2;

public class StaticMethod {

    public static void signIn(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException{
        if(login.length()>20){
            String massage = "Login > 20";
            throw new WrongLoginException(massage);
        }else{
            System.out.println("Ok");
        }
        if(password.length()>20){
            String massagepassword = "Password > 20";
            throw new WrongPasswordException(massagepassword);
        }else if(!password.equals(confirmPassword)){
            String massagepassword = "Password != confirmPassword";
            throw new WrongPasswordException(massagepassword);
        }else{
            System.out.println("OK");
        }
        String[] number = password.split("");
        for(int i = 0; i < number.length; i++){
            try {
                int value = Integer.valueOf(number[i]);
                String massage = "Есть число";
                throw new WrongPasswordException(massage);
            }catch (NumberFormatException e){
                e.getMessage();
            }
        }
    }
}
