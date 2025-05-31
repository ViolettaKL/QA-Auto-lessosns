package HW_8.funcionalLambda.Task_3;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 ==0;
        System.out.println(isEven.test(6));
        System.out.println(isEven.test(3));
        System.out.println(isEven.test(7));
    }
}
