package HW_6.ArrayList.Task_5;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(11);
        numbers.add(24);
        numbers.add(51);

        if(numbers.isEmpty()){
            System.out.println("Список пункт");
            return;
        }
        int maxNumber = Collections.max(numbers);
        System.out.println("Максимальное число в списке: " + maxNumber);
    }
}
