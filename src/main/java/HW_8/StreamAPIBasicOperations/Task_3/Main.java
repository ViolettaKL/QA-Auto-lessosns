package HW_8.StreamAPIBasicOperations.Task_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("крепость", "башня", "облака", "апельсин", "груша");

        List<Integer> lengthString = strings.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(lengthString);
    }
}
