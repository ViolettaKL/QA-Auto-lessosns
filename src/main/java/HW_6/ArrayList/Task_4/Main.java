package HW_6.ArrayList.Task_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10,11,56,13));
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        System.out.println("Сумма всех чисел: " + sum);
    }
}
