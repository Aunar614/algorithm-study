package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Jungol_9080 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] pascal = new int[5][];
        for (int i = 0; i < pascal.length; i++) {
            pascal[i] = new int[i + 1];
            // 각 행의 첫번째와 마지막 숫자는 1
            pascal[i][0] = 1;
            pascal[i][i]= 1;
            // 중간에 위치한 숫자는 이전 행의 왼쪽에 있는 숫자와 바로 위에 있는 숫자의 합
            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }

        for (int i = 0; i < pascal.length; i++) {
            for (int j = 0; j < pascal[i].length; j++) {
                bw.write(pascal[i][j] + "");
                if (j < pascal[i].length - 1) {
                    bw.write(" ");
                }
            }
            if (i < pascal.length - 1) {
                bw.write("\n");
            }
        }

        sc.close();
        bw.close();
    }
}