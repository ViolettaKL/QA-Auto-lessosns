package practice_8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByGender {
    /* список строк с именами и полом
    * пример: "John:M", "Sarah:F"
    * нужно сгруппировать по полу в мапу Map<String(пол), List<String>(список имен)
    * */

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John:M", "Sarah:F");

        Map<String, List<String>> groupedByGender = (Map<String, List<String>>) names.stream()
                .collect(Collectors.groupingBy(name -> name.split(":")[1],
                        Collectors.mapping(name -> name.split(":")[0], Collectors.toList())));

        System.out.println(groupedByGender);
    }
}
