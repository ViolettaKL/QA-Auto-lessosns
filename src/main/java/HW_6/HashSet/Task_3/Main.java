package HW_6.HashSet.Task_3;

import java.util.List;
import java.util.Set;

import static HW_6.HashSet.Task_3.UniqueStrings.getUniqueStrings;

public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of("Tanya", "Sveta", "green", "green", "red", "Tanya");
        Set<String> uniqueStrings = getUniqueStrings(strings);
        System.out.println(uniqueStrings);
    }
}
