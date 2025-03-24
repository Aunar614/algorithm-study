package jungol.stepping.function;

import java.util.Scanner;

public class Jungol_181 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi = 3.141592;

        System.out.print("radius : ");
        double radius = sc.nextDouble();

        double area = radius * radius * pi;

        System.out.printf("area = %.3f", area);
    }
}
