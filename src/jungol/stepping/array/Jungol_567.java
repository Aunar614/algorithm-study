package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Jungol_567 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] numbers = new int[3][5];

        numbers[0][0] = 5;
        numbers[0][1] = 8;
        numbers[0][2] = 10;
        numbers[0][3] = 6;
        numbers[0][4] = 4;
        numbers[1][0] = 11;
        numbers[1][1] = 20;
        numbers[1][2] = 1;
        numbers[1][3] = 13;
        numbers[1][4] = 2;
        numbers[2][0] = 7;
        numbers[2][1] = 9;
        numbers[2][2] = 14;
        numbers[2][3] = 22;
        numbers[2][4] = 3;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                bw.write(String.format("%2d   ", numbers[i][j]));
            }
            if (i < numbers.length - 1) {
                bw.write("\n");
            }
        }

        sc.close();
        bw.close();
    }
}