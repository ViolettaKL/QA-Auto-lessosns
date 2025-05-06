package HW_7.Task_2;

public class Main {
    public static void divideNumbers(int a, int b){
        try{
            int divideresult = a / b;
        }catch (ArithmeticException e){
            System.out.println("Деление на 0 невозможно");
        }
    }

    public static void main(String[] args) {
        divideNumbers(5, 0);
    }
}
