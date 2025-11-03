package javaapplication2;

import org.junit.Test;
import static org.junit.Assert.*;

public class DaysInMonthTest {

    @Test
    public void testJanuary() {
        assertEquals(31, DaysInMonth.getDaysInMonth(2023, 1));
    }

    @Test
    public void testApril() {
        assertEquals(30, DaysInMonth.getDaysInMonth(2023, 4));
    }

    @Test
    public void testFebruaryLeapYear() {
        assertEquals(29, DaysInMonth.getDaysInMonth(2024, 2));
    }

    @Test
    public void testFebruaryNotLeapYear() {
        assertEquals(28, DaysInMonth.getDaysInMonth(2023, 2));
    }

    @Test
    public void testInvalidMonth() {
        assertEquals(0, DaysInMonth.getDaysInMonth(2023, 13));
    }
}
