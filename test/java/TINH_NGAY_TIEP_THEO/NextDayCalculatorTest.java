package TINH_NGAY_TIEP_THEO;

import NGAY8.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {


    @Test
    void dayAfter1() {
        int year = 2018;
        int month = 1;
        int day = 1;

        String expected = "2/1/2018";
        String result =NextDayCalculator.DayAfter(year,month,day);
        assertEquals(expected, result);
    }
    @Test
    void dayAfter2() {
        int year = 2018;
        int month = 1;
        int day = 31;

        String expected = "1/2/2018";
        String result =NextDayCalculator.DayAfter(year,month,day);
        assertEquals(expected, result);
    }
    @Test
    void dayAfter3() {
        int year = 2018;
        int month = 4;
        int day = 30;

        String expected = "1/5/2018";
        String result =NextDayCalculator.DayAfter(year,month,day);
        assertEquals(expected, result);
    }

    @Test
    void dayAfter4() {
        int year = 2018;
        int month = 2;
        int day = 28;

        String expected = "1/3/2018";
        String result =NextDayCalculator.DayAfter(year,month,day);
        assertEquals(expected, result);
    }

    @Test
    void dayAfter5() {
        int year = 2020;
        int month = 2;
        int day = 29;

        String expected = "1/3/2020";
        String result =NextDayCalculator.DayAfter(year,month,day);
        assertEquals(expected, result);
    }

    @Test
    void dayAfter6() {
        int year = 2018;
        int month = 12;
        int day = 31;

        String expected = "1/1/2019";
        String result =NextDayCalculator.DayAfter(year,month,day);
        assertEquals(expected, result);
    }
}