package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Jungol_9079 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] scores = new int[3][4];

        for (int i = 0; i < scores.length; i++) {
            bw.write((i + 1) + "번째 학생의 점수 ");
            bw.flush();
            int sum = 0;
            for (int j = 0; j < scores[i].length - 1; j++) {
                int score = sc.nextInt();
                sum += score;
                scores[i][j] = score;
            }
            scores[i][3] = sum;
        }

        bw.write(String.format("%7s%3s%3s%3s", "국어", "영어", "수학", "총점") + "\n");
        for (int i = 0; i < scores.length; i++) {
            bw.write(String.format("%2d번%4d%4d%4d%4d", i + 1, scores[i][0], scores[i][1], scores[i][2], scores[i][3]) + "\n");
        }

        int sum1 = scores[0][0] + scores[1][0] + scores[2][0];
        int sum2 = scores[0][1] + scores[1][1] + scores[2][1];
        int sum3 = scores[0][2] + scores[1][2] + scores[2][2];
        int sum4 = scores[0][3] + scores[1][3] + scores[2][3];

        bw.write("합계" + String.format("%4d%4d%4d%4d", sum1, sum2, sum3, sum4));

        sc.close();
        bw.close();
    }
}