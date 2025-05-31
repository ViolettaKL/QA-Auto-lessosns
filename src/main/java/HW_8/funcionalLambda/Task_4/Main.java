package HW_8.funcionalLambda.Task_4;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = s -> s.length();
        Integer length = stringLength.apply("Длина строки");
        System.out.println(length);
    }
}
