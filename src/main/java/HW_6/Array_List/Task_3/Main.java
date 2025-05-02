package HW_6.Array_List.Task_3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("order", "employee", "and"));
        String longest = "";
        for (String str : strings){
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        System.out.println("Самое длинное слово: " + longest);
    }
}
