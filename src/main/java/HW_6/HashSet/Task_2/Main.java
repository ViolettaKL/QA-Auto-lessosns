package HW_6.HashSet.Task_2;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);
        numbers.add(17);
        numbers.add(18);
        numbers.add(19);
        numbers.add(20);

        int numbersCheck = 1;
        if(numbers.contains(numbersCheck)){
            System.out.println("Список содержит число: " + numbersCheck);
        }else{
            System.out.println("Список не содержит число: " + numbersCheck);
        }
    }
}
