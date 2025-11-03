package javaapplication2;

public class CheckDate {

    public static boolean CheckDate(int year, int month, int day) {
        if (month < 1 || month > 12) return false;
        if (day < 1) return false;

        int maxDay = DaysInMonth.getDaysInMonth(year, month);
        return day <= maxDay;
    }
}
