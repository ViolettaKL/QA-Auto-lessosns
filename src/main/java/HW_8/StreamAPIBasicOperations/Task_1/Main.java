package HW_8.StreamAPIBasicOperations.Task_1;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("крепость", "башня", "облака", "апельсин", "груша");

        List<String> filteredStrings = strings.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());

        System.out.println(filteredStrings);
    }
}
