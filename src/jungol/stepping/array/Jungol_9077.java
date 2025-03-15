package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Jungol_9077 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] numbers = new int[3][3];

        numbers[0][0] = 3;
        numbers[0][1] = 5;
        numbers[0][2] = 4;
        numbers[1][0] = 2;
        numbers[1][1] = 6;
        numbers[1][2] = 7;
        numbers[2][0] = 8;
        numbers[2][1] = 10;
        numbers[2][2] = 1;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                bw.write(numbers[i][j] + "");
                if (j < numbers[i].length - 1) {
                    bw.write(" ");
                }
            }
            if (i < numbers.length - 1) {
                bw.write("\n");
            }
        }

        sc.close();
        bw.close();
    }
}