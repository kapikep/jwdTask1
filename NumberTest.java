package com.epam.jwd.module1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberTest {

    @Test
    void getCountOfDigit() {

        int expected = 5;
        int actual = Number.countOfInputDigit(12345);

        assertEquals(expected,  actual);
    }

    @Test
    void getDigitByPosition() {

        Number number = new Number(4321);
        int expected = 3;
        int actual = number.getDigitByPosition(2);

        assertEquals(expected,  actual);
    }

    @Test
    void equalsTwoFirstAndTwoLastDigit() {

        Number number = new Number(1221);
        Number number1 = new Number(1234);

        assertTrue(number.equalsTwoFirstAndTwoLastDigit());

        assertFalse(number1.equalsTwoFirstAndTwoLastDigit());
    }

}