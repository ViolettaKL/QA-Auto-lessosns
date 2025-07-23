package palendrome;

/**
 * Алгоритм:
 * 1. понять задачу
 * 2. разобраться с примерами
 * Входные данные --> результат
 * 3. найти логический алгоритм
 * 4. Протестировать алгоритм
 * 5.Переносим алгоритм в код
 * 6. Протестировать свой же код (техники тест-дизайна)
 */

import HW_2.Main;

import java.util.Locale;

/**"Привет, мир!" - false
 "Гаг - гаг!" - true
 " " - true
 "a" - true
 "faaf" - true
 */

public class Palendrome {
    
    public  static boolean checkIfPolindrome(String str){
        //1. Убрать пробелы и знаки препинания
        String cleanStr = str.replaceAll("[^A-Za-z]", "");

        //2. приведение строки к нижнему регистру
        String lowerCaseStr = cleanStr.toLowerCase();

        //3. сравнение строки и её перевернутой строки, если равны то полиндром
        return  lowerCaseStr.equals(new StringBuilder(lowerCaseStr).reverse().toString());
    }
}

public static void main(String[] args) {
    System.out.println();
}
