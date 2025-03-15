package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Jungol_569 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] scores = new int[5][4];

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                int score = sc.nextInt();
                scores[i][j] = score;
            }
        }

        int passCount = 0;
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            int avg = sum / 4;
            if (avg >= 80) {
                bw.write("pass\n");
                passCount++;
            } else {
                bw.write("fail\n");
            }
        }
        bw.write("Successful : " + passCount);

        sc.close();
        bw.close();
    }
}