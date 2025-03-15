package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Jungol_165 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] numbers = new int[5][5];
        numbers[0][0] = 1;
        numbers[0][1] = 0;
        numbers[0][2] = 1;
        numbers[0][3] = 0;
        numbers[0][4] = 1;
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                int rightNum = 0;
                int leftNum = 0;
                if (j != 4) {
                    rightNum = numbers[i - 1][j + 1];
                }
                if (j != 0) {
                    leftNum = numbers[i - 1][j - 1];
                }
                numbers[i][j] = leftNum + rightNum;
            }
        }

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