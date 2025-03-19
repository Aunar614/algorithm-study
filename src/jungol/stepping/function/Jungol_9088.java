package jungol.stepping.function;

import java.util.Scanner;

public class Jungol_9088 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();
        int m = sc.nextInt();

        switch (str) {
            case "+" -> plusNum(n, m);
            case "-" -> minusNum(n, m);
            case "*" -> multiplyNum(n, m);
            case "/" -> divisionNum(n, m);
            default -> System.out.println("0");
        }
    }

    private static void plusNum(int n, int m) {
        System.out.println(n + " + " + m + " = " + (n + m));
    }

    private static void minusNum(int n, int m) {
        System.out.println(n + " - " + m + " = " + (n - m));
    }

    private static void multiplyNum(int n, int m) {
        System.out.println(n + " * " + m + " = " + (n * m));
    }

    private static void divisionNum(int n, int m) {
        System.out.println(n + " / " + m + " = " + (n / m));
    }
}
