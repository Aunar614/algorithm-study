package jungol.stepping.function;

import java.util.Scanner;

public class Jungol_581 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        double n = sc.nextDouble();
        double m = sc.nextDouble();

        checkNumAbs(a, b);
        checkDoubleAbs(n, m);
    }

    private static void checkDoubleAbs(double n, double m) {
        double a = Math.abs(n);
        double b = Math.abs(m);

        double min = Math.min(a, b);
        if (min == a) {
            System.out.printf("%.2f", n);
        } else {
            System.out.printf("%.2f", m);
        }
    }

    private static void checkNumAbs(int a, int b) {
        int n = Math.abs(a);
        int m = Math.abs(b);

        int max = Math.max(n, m);
        if (max == n) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
