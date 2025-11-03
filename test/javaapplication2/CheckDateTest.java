package javaapplication2;

import org.junit.Test;
import static org.junit.Assert.*;

public class CheckDateTest {

    @Test
    public void testValidDate() {
        assertTrue(CheckDate.CheckDate(2005, 6, 21)); // 21/06/2005 hợp lệ
    }

    @Test
    public void testInvalidDay() {
        assertFalse(CheckDate.CheckDate(2005, 6, 31)); // tháng 6 chỉ có 30 ngày
    }

    @Test
    public void testLeapYearValid() {
        assertTrue(CheckDate.CheckDate(2024, 2, 29)); // năm nhuận
    }

    @Test
    public void testLeapYearInvalid() {
        assertFalse(CheckDate.CheckDate(2023, 2, 29)); // không nhuận
    }

    @Test
    public void testInvalidMonth() {
        assertFalse(CheckDate.CheckDate(2023, 13, 10)); // tháng 13 không tồn tại
    }
}

