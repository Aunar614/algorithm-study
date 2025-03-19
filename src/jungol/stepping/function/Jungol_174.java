package jungol.stepping.function;

import java.util.Scanner;

public class Jungol_174 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] scores = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = sc.nextInt();
            }
        }

        sumScore(scores);
        totalScore(scores);
    }

    private static void sumScore(int[][] scores) {
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print(scores[i][j]);
                if (j < 3) {
                    System.out.print(" ");
                }
                sum += scores[i][j];
            }
            System.out.println(sum);
        }
    }

    private static void totalScore(int[][] scores) {
        int[] total = new int[4];
        total[0] = scores[0][0] + scores[1][0] + scores[2][0];
        total[1] = scores[0][1] + scores[1][1] + scores[2][1];
        total[2] = scores[0][2] + scores[1][2] + scores[2][2];
        total[3] = total[0] + total[1] + total[2];

        for (int i = 0; i < total.length; i++) {
            System.out.print(total[i]);
            if (i < total.length - 1) {
                System.out.print(" ");
            }
        }
    }


}
