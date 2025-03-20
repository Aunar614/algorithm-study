package jungol.stepping.function;

import java.util.Scanner;

public class Jungol_583 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double max = searchMax(a, b, c);
        double min = searchMin(a, b, c);
        double alone = searchAlone(a, b, c, max, min);

        System.out.println((int) Math.ceil(max) + " " + (int) Math.floor(min) + " " + Math.round(alone));
    }

    private static double searchAlone(double a, double b, double c, double max, double min) {
        double alone = 0;
        double[] numbers = new double[3];
        numbers[0] = a;
        numbers[1] = b;
        numbers[2] = c;
        for (double number : numbers) {
            if (number != max && number != min) {
                alone = number;
            }
        }
        return alone;
    }

    private static double searchMin(double a, double b, double c) {
        double min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        return min;
    }

    private static double searchMax(double a, double b, double c) {
        double max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        return max;
    }
}
