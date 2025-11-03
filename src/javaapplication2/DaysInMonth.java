package javaapplication2;

public class DaysInMonth {

    public static int getDaysInMonth(int year, int month) {
        if (month < 1 || month > 12) return 0;

        // Tháng 31 ngày
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
            month == 8 || month == 10 || month == 12) {
            return 31;
        }
        // Tháng 30 ngày
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        // Tháng 2: kiểm tra năm nhuận
        if (month == 2) {
            if (year % 400 == 0) return 29;
            if (year % 100 == 0) return 28;
            if (year % 4 == 0) return 29;
            return 28;
        }
        return 0;
    }
}
