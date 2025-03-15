package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Jungol_568 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr1 = new int[2][4];
        int[][] arr2 = new int[2][4];

        bw.write("first array\n");
        bw.flush();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                int n = sc.nextInt();
                arr1[i][j] = n;
            }
        }

        bw.write("second array\n");
        bw.flush();
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                int n = sc.nextInt();
                arr2[i][j] = n;
            }
        }

        int[][] answer = new int[2][4];
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                answer[i][j] = arr1[i][j] * arr2[i][j];
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