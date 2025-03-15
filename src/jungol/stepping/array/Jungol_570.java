package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Jungol_570 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] number = new int[5][5];
        number[0][0] = 1;
        number[0][1] = 1;
        number[0][2] = 1;
        number[0][3] = 1;
        number[0][4] = 1;
        for (int i = 1; i < number.length; i++) {
            number[i][0] = 1;
            for (int j = 1; j < number[i].length; j++) {
                number[i][j] = number[i - 1][j] + number[i][j - 1];
            }
        }

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                bw.write(number[i][j] + "");
                if (j < number[i].length - 1) {
                    bw.write(" ");
                }
            }
            if (i < number.length - 1) {
                bw.write("\n");
            }
        }

        sc.close();
        bw.close();
    }
}