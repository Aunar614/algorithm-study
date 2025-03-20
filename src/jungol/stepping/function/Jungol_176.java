package jungol.stepping.function;

import java.util.Scanner;

public class Jungol_176 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double num1 = Math.sqrt(Math.min(a, b));
        double num2 = Math.sqrt(Math.max(a, b));

        int count = 0;
        for (int i = (int) num1; i < (int) num2; i++) {
            count++;
        }

        if ((int) num1 < num1) {
            count -= 1;
        }
        if ((int) num2 <= num2) {
            count += 1;
        }
        System.out.println(count);
    }
}
