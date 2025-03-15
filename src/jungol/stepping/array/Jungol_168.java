package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Jungol_168 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = sc.nextInt();
        int[][] number = new int[num][];

        for (int i = 0; i < num; i++) {
            number[i] = new int[i + 1];

            number[i][0] = 1;
            number[i][i] = 1;
            for (int j = 1; j < i; j++) {
                number[i][j] = number[i - 1][j - 1] + number[i - 1][j];
            }
        }

        for (int i = number.length - 1; i >= 0; i--) {
            for (int j = 0; j < number[i].length; j++) {
                bw.write(number[i][j] + "");
                if (j < number[i].length - 1) {
                    bw.write(" ");
                }
            }
            if (i > 0) {
                bw.write("\n");
            }
        }

        sc.close();
        bw.close();
    }
}