package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Jungol_166 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] number = new int[4][3];
        for (int i = 0; i < number.length; i++) {
            if (i == 0) {
                bw.write("first array\n");
                bw.flush();
            } else if (i == 2) {
                bw.write("second array\n");
                bw.flush();
            }
            for (int j = 0; j < number[i].length; j++) {
                int n = sc.nextInt();
                number[i][j]= n;
            }
        }

        int[][] answer = {{(number[0][0] * number[2][0]), (number[0][1] * number[2][1]), (number[0][2] * number[2][2])},
                {(number[1][0] * number[3][0]), (number[1][1] * number[3][1]), (number[1][2] * number[3][2])}};

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                bw.write(answer[i][j] + "");
                if (j < answer[i].length - 1) {
                    bw.write(" ");
                }
            }
            if (i < answer.length - 1) {
                bw.write("\n");
            }
        }

        sc.close();
        bw.close();
    }
}