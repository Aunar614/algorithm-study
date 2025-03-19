package jungol.stepping.function;

import java.util.Scanner;

public class Jungol_572 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        areaCircle(n);
    }

    private static void areaCircle(int n) {
        System.out.printf("%.2f", n * n * 3.14);
    }

}
