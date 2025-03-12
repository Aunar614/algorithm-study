package jungol.stepping.debuging;

import java.io.*;

public class Jungol_527 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String number = br.readLine();
        String[] numbers = number.split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        int divide1 = a / b;
        double divide2 = (double) a / b;

        bw.write(divide1 + " " + String.format("%.2f", divide2));

        br.close();
        bw.close();
    }
}
