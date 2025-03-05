package jungol;

public class Jungol_9012 {

    public static void main(String[] args) {

        int a = 5;
        int b = 2;
        double circle = 3.140000;

        System.out.printf("원주 = " + a + " * " + b + " * " + "%.6f" + " = ", circle);
        System.out.printf("%.6f", a * b * circle);
        System.out.println();

        System.out.printf("넓이 = " + a + " * " + a + " * " + "%.6f" + " = ", circle);
        System.out.printf("%.6f", a * a * circle);
    }
}
