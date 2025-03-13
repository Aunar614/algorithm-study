package jungol.stepping.array;

import java.io.*;
import java.util.Scanner;

public class Jungol_559 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double[] avgScores = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
        double sum = avgScores[sc.nextInt() - 1] + avgScores[sc.nextInt() - 1];

        bw.write(String.format("%.1f", sum));

        sc.close();
        bw.close();
    }
}