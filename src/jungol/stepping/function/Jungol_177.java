package jungol.stepping.function;

import java.util.Scanner;

public class Jungol_177 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += Math.abs(sc.nextInt());
        }

        System.out.println(sum);
    }
}
