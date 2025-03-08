package jungol;

import java.io.*;

public class Jungol_9043 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String number = br.readLine();
        String[] checkNum = number.split(" ");

        int[] numbers = new int[checkNum.length];

        for (int i = 0; i < checkNum.length; i++) {
            numbers[i] = Integer.parseInt(checkNum[i]);
        }

        int count = 0;
        int avgCount = 0;
        int sum = 0;
        while (true) {
            int i = numbers[count];

            if (i == 0) {
                break;
            }

            if (i % 2 != 0) {
                sum += i;
                avgCount++;
            }

            count++;
        }

        double avg = (double) sum / avgCount;
        bw.write("홀수의 합 = " + sum + "\n");
        bw.write("홀수의 평균 = " + (int) avg);

        bw.close();
    }
}
