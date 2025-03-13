package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Jungol_562 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numbers = new int[10];
        int sumOdd = 0;
        int sumEven = 0;
        int count = 0;
        int oddCount = 0;
        for (int i = 1; i <= 10; i++) {
            numbers[count] = sc.nextInt();
            if (i % 2 == 0) {
                sumEven += numbers[count];
            } else {
                sumOdd += numbers[count];
                oddCount++;
            }
            count++;
        }

        double oddAvg = (double) sumOdd / oddCount;

        bw.write("sum : " + sumEven + "\n");
        bw.write("avg : " + String.format("%.1f", oddAvg));

        sc.close();
        bw.close();
    }
}