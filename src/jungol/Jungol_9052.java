package jungol;

import java.io.*;

public class Jungol_9052 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        String[] number = num.split(" ");

        int[] numbers = new int[number.length];
        for (int i = 0; i < number.length; i++) {
            numbers[i] = Integer.parseInt(number[i]);
        }

        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        double avg = (double) sum / numbers.length;

        bw.write("총점 : " + sum + "\n");
        bw.write("평균 : " + String.format("%.1f", avg));

        br.close();
        bw.close();
    }
}
