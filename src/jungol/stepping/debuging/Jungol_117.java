package jungol.stepping.debuging;

import java.io.*;

public class Jungol_117 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String number = br.readLine();
        String[] numbers = number.split(" ");

        double a = Double.parseDouble(numbers[0]);
        double b = Double.parseDouble(numbers[1]);
        double c = Double.parseDouble(numbers[2]);

        double sum = Math.floor(a) + Math.floor(b) + Math.floor(c);
        double avg = (a + b + c) / numbers.length;

        bw.write("sum " + (int) sum + "\n");
        bw.write("avg " + (int) avg);

        br.close();
        bw.close();
    }
}
