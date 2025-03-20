package jungol.stepping.function;

import java.util.Scanner;

public class Jungol_9095 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정사각형의 넓이 : ");
        int square = sc.nextInt();

        checkLine(square);

        System.out.print("밑과 지수 : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        checkNum(num1, num2);
    }

    private static void checkNum(int num1, int num2) {
        double multiply = num1;
        for (int i = 1; i < num2; i++) {
            multiply *= num1;
        }
        System.out.printf("%.6f의 %.6f승은 %.6f입니다.", (double) num1, (double) num2, multiply);

    }

    private static void checkLine(int square) {
        int checkSquare = 0;
        int line = 0;
        for (int i = 1; i < square / 4; i++) {
            checkSquare = i * i;
            if (checkSquare == square) {
                line = i;
                break;
            }
        }
        System.out.printf("정사각형의 한 변의 길이 : %.6f\n", (double) line);
    }
}
