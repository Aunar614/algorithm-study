package jungol.stepping.function;

import java.util.Scanner;

public class Jungol_582 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int circle = sc.nextInt();

        checkCircle(circle);
    }

    private static void checkCircle(int circle) {
        double radius = Math.sqrt(circle / 3.14);
        System.out.printf("%.2f", radius);
    }
}
