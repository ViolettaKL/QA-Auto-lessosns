package practice_8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FilterList {
    public static void main(String[] args) {
        /* задача 1. Создать список целых чисел.
        Далее отфильтровать их и суммировать
        Промежуточная операция: фильтрация по четности
        Терминальная операция: суммирование */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        IntStream stream = IntStream.of(numbers.stream()
                .filter(n -> {
                    System.out.println("filter: " + n);
                    return n % 2 == 0;
                })
                .mapToInt(n ->{
                    System.out.println("mapToInt: " + n);
                    return  n;
                })
                .sum());

        System.out.println("Стрим создан, но терминальный метод еще не вызван");
        int sum = stream.sum();

        System.out.println(sum);
    }
}
