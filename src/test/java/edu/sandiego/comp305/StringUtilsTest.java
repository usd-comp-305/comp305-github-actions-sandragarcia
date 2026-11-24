package edu.sandiego.comp305;

import edu.sandiego.cs.comp305.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class StringUtilsTest {
    @Test
    void reverseStringStringIsEmpty() {
        final String str = "";

        final String expectedResult = "";
        final String actualResult = StringUtils.reverseString(str);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void reverseStringStringIsNotEmpty() {
        final String str = "hello";
        final String expectedResult = "olleh";
        final String actualResult = StringUtils.reverseString(str);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void reverseStringStringIsPalindrome() {
        final String str = "level";
        final String expectedResult = "level";
        final String actualResult = StringUtils.reverseString(str);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void reverseStringStringHasCaps() {
        final String str = "Hello World";
        final String expectedResult = "dlroW olleH";
        final String actualResult = StringUtils.reverseString(str);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void reverseStringStringIsSingleChar() {
        final String str = "i";
        final String expectedResult = "i";
        final String actualResult = StringUtils.reverseString(str);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void reverseStringStringIsSpecialChar() {
        final String str = "!";
        final String expectedResult = "!";
        final String actualResult = StringUtils.reverseString(str);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void reverseStringStringisWhiteSpace() {
        final String str = "   ";
        final String expectedResult = "   ";
        final String actualResult = StringUtils.reverseString(str);

        assertEquals(expectedResult, actualResult);
    }
}
