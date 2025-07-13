package HW_6.ArrayList.Task_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        numbers.add(6);
        System.out.println(numbers);
    }
}
