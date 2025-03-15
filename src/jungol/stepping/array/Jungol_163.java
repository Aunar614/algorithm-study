package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Jungol_163 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] numbers = {{3, 5, 9}, {2, 11, 5}, {8, 30, 10}, {22, 5, 1}};
        int sum = 0;
        for (int[] number : numbers) {
            for (int i = 0; i < number.length; i++) {
                int num = number[i];
                sum += num;
                bw.write(num + "");
                if (i < number.length - 1) {
                    bw.write(" ");
                }
            }
            bw.write("\n");
        }
        bw.write(sum + "");

        sc.close();
        bw.close();
    }
}