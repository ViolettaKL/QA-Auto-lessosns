package HW_8.StreamAPIBasicOperations.Task_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 10, 50, 45, 33, 56);

        List<Integer> filteredNumbers = numbers.stream()
                .filter(n -> n % 5 == 0)
                .collect(Collectors.toList());

        System.out.println(filteredNumbers);
    }
}
