package TINH_KET_QUA_FIZZ_BUZZ;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void translate0() {
        int number = 45;
        String expected = "FizzBuzz";

        String result =  FizzBuzzTranslate. translate(number);
        assertEquals(expected, result);
    }

    @Test
    void translate1() {
        int number = 32;
        String expected = "Fizz";

        String result =  FizzBuzzTranslate. translate(number);
        assertEquals(expected, result);
    }

    @Test
    void translate2() {
        int number = 41;
        String expected = "bon mot";

        String result =  FizzBuzzTranslate. translate(number);
        assertEquals(expected, result);
    }

    @Test
    void translate3() {
        int number = 53;
        String expected = "FizzBuzz";

        String result =  FizzBuzzTranslate. translate(number);
        assertEquals(expected, result);
    }

}