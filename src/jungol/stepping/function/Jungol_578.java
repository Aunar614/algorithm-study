package jungol.stepping.function;

import java.util.Scanner;

public class Jungol_578 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        multiplyTable(Math.min(a, b), Math.max(a, b));
    }

    private static void multiplyTable(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.println("== " + i + "dan ==");
            for (int j = 1; j <= 9; j++) {
                System.out.printf(i + " * " + j + " = " + "%2d\n",(i * j));

            }
            if (i < max) {
                System.out.println();
            }
        }
    }
}
