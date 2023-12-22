package hw_3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTest {

    @ParameterizedTest
    @DisplayName("Test the number is even")
    @ValueSource(ints = {-2, 0, 2})
    void testNumberIsEven(int n) {
        assertTrue(Homework.evenOddNumber(n));
    }

    @ParameterizedTest
    @DisplayName("Test the number is odd")
    @ValueSource(ints = {-1, 1, 3})
    void testNumberIsOdd(int n) {
        assertFalse(Homework.evenOddNumber(n));
    }

    @ParameterizedTest
    @DisplayName("Test the number belongs to the interval")
    @ValueSource(ints = {26, 50, 75, 99})
    void testNumberInRange25To100(int n) {
        assertTrue(Homework.numberInInterval(n));
    }

    @ParameterizedTest
    @DisplayName("Test the number does not belong to the interval")
    @ValueSource(ints = {25, 100})
    void testNumberNotInRange25To100(int n) {
        assertFalse(Homework.numberInInterval(n));
    }
}