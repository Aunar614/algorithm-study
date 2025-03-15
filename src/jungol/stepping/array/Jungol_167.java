package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Jungol_167 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] number = new int[4][2];
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                int n = sc.nextInt();
                number[i][j]= n;
            }
        }

        int[] widthSum = new int[4];
        for (int i = 0; i < widthSum.length; i++) {
            int sum = 0;
            for (int j = 0; j < number[i].length; j++) {
                sum += number[i][j];
            }
            widthSum[i] = sum / number[0].length;
        }
        int[] heightSum = new int[2];
        for (int i = 0; i < heightSum.length; i++) {
            int sum = 0;
            for (int j = 0; j < number.length; j++) {
                sum += number[j][i];
            }
            heightSum[i] = sum / number.length;
        }

        for (int i = 0; i < widthSum.length; i++) {
            bw.write(widthSum[i] + "");
            if (i < widthSum.length - 1) {
                bw.write(" ");
            }
        }

        bw.write("\n");
        for (int i = 0; i < heightSum.length; i++) {
            bw.write(heightSum[i] + "");
            if (i < heightSum.length - 1) {
                bw.write(" ");
            }
        }

        int totalSum = 0;
        for (int[] numbers : number) {
            for (int j = 0; j < numbers.length; j++) {
                totalSum += numbers[j];
            }
        }
        bw.write("\n");
        bw.write(totalSum / (number.length * number[0].length) + "");

        sc.close();
        bw.close();
    }
}