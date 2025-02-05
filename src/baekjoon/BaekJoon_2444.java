package baekjoon;

import java.util.Scanner;

public class BaekJoon_2444 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int numbers = num * 2 - 1;
        int count = 1;
        int count2 = 1;

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num - count; j++) {
                System.out.print(" ");
            }
            count += 1;
            for (int j = 1; j <= count2; j++) {
                System.out.print("*");
            }
            count2 += 2;
            System.out.println();
        }

        count -= 2;
        count2 -= 4;

        for (int i = 2; i <= num; i++) {
            for (int j = 0; j < num - count; j++) {
                System.out.print(" ");
            }
            count -= 1;
            for (int j = 1; j <= count2; j++) {
                System.out.print("*");
            }
            count2 -= 2;
            System.out.println();
        }

    }
}
