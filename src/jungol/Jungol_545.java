package jungol;

import java.io.*;

public class Jungol_545 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        String[] number = num.split(" ");

        int[] numbers = new int[number.length];
        for (int i = 0; i < number.length; i++) {
            numbers[i] = Integer.parseInt(number[i]);
        }

        int checkNum3 = 0;
        int checkNum5 = 0;
        for (int i : numbers) {
            if (i % 3 == 0) {
                checkNum3++;
            }
            if (i % 5 == 0) {
                checkNum5++;
            }
        }

        bw.write("Multiples of 3 : " + checkNum3 + "\n");
        bw.write("Multiples of 5 : " + checkNum5);

        br.close();
        bw.close();
    }
}
