package practice_10;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringProcessorTest {
    /**Тесты для переворота строки:
     * позитивный сценарий: sasha -> ahsas
     * corner cases:
     *          "" -> ""
     *          "a" -> "a"
     *          null -> IllegalArgument Exception
     * **/
    @ParameterizedTest
    public void userCanReverseValidString(String initialString, String expectedString){
        StringProcessor stringProcessor = new StringProcessor();
        String reversedString = stringProcessor.reverse(initialString);
        assertEquals(expectedString, reversedString, "We expected result " + expectedString + ", but happened " + reversedString);
    }
}
