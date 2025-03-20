package jungol.stepping.function;

import java.util.Scanner;

public class Jungol_580 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();

        checkDate(month, day);
    }

    private static void checkDate(int month, int day) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day > 31 || day < 1) {
                System.out.println("BAD!");
            } else {
                System.out.println("OK!");
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day > 30  || day < 1) {
                System.out.println("BAD!");
            } else {
                System.out.println("OK!");
            }
        } else if (month == 2) {
            if (day > 29 || day < 1) {
                System.out.println("BAD!");
            } else {
                System.out.println("OK!");
            }
        } else {
            System.out.println("BAD!");
        }
    }
}
