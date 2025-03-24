package jungol.stepping.function;

import java.util.Scanner;

public class Jungol_180 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[7];
        for (int i = 0; i < 7; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            changeNum(num);
        }

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
            if (i < num.length - 1) {
                System.out.print(" ");
            }
        }
    }

    private static void changeNum(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            int temp = 0;
            if (num[i] > num[i + 1]) {
                temp = num[i + 1];
                num[i + 1] = num[i];
                num[i] = temp;
            }
        }
    }
}
