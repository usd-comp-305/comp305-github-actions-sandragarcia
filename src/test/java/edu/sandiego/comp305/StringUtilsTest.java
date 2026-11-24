package edu.sandiego.comp305;

import edu.sandiego.cs.comp305.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class StringUtilsTest {
    @Test
    void reverseStringStringIsEmpty() {
        String str = "";

        String expectedResult = "";
        String actualResult = StringUtils.reverseString(str);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void reverseStringStringIsNotEmpty() {
    String str = "hello";
        String expectedResult = "olleh";
        String actualResult = StringUtils.reverseString(str);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void reverseStringStringIsPalindrome() {
        String str = "level";
        String expectedResult = "level";
        String actualResult = StringUtils.reverseString(str);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void reverseStringStringHasCaps() {
        String str = "Hello World";
        String expectedResult = "dlroW olleH";

        String actualResult = StringUtils.reverseString(str);
    }
}
