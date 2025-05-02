package HW_6.Array_List.Task_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        evenNumbers.forEach(
                evenNumber ->{
                    if(evenNumber % 2 == 0){
                        System.out.println("Четное число: " + evenNumber);
                    }
                }
        );
    }
}
