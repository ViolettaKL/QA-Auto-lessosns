package HW_7.Task_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void validateEmail(String email){
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if(!matcher.matches()){
            throw new InvalidEmailException("Неверный формат email: " + email);

        }
        System.out.println("Email верный: " + email);
    }

    public static void main(String[] args) {
        try{
            validateEmail("73Violetta@gmail.com");
        }catch (InvalidEmailException e){
            System.out.println(e.getMessage());
        }
    }

}
