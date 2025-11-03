package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Input year, month and day:");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        if (CheckDate.CheckDate(year, month, day)) {
            System.out.println("Valid Date");
        } else {
            System.out.println("Invalid Date");
        }
    }
}


