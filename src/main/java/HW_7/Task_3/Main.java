package HW_7.Task_3;

public class Main {
    public static void checkAge(int age) throws AgeException{
        if (age < 0 || age > 150){
            throw new AgeException("Неверный возраст: " + age);
        }
        System.out.println("Возраст: " + age);
    }

    public static void main(String[] args) {
        try{
            checkAge(18);
        }catch (AgeException e){
            System.out.println(e.getMessage());
        }
    }
}
