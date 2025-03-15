package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Jungol_164 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] scores = new int[4][3];
        for (int i = 0; i < scores.length; i++) {
            bw.write((i + 1) + "class? ");
            bw.flush();
            for (int j = 0; j < scores[i].length; j++) {
                int score = sc.nextInt();
                scores[i][j]= score;
            }
        }

        bw.write("1class : " + (scores[0][0] + scores[0][1] + scores[0][2]) + "\n");
        bw.write("2class : " + (scores[1][0] + scores[1][1] + scores[1][2]) + "\n");
        bw.write("3class : " + (scores[2][0] + scores[2][1] + scores[2][2]) + "\n");
        bw.write("4class : " + (scores[3][0] + scores[3][1] + scores[3][2]));

        sc.close();
        bw.close();
    }
}