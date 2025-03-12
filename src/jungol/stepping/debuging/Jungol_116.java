package jungol.stepping.debuging;

import java.io.*;

public class Jungol_116 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String number = br.readLine();
        String[] numbers = number.split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int c = Integer.parseInt(numbers[2]);

        double avg = (double) (a + b + c) / numbers.length;

        bw.write(String.format("%.1f", avg));

        br.close();
        bw.close();
    }
}
