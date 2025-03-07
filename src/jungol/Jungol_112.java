package jungol;

import java.io.*;

public class Jungol_112 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String number = br.readLine();
        String[] numbers = number.split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        int avg = a / b;
        int remainder = a % b;

        bw.write(a + " / " + b + " = " + avg + "..." + remainder);

        br.close();
        bw.close();
    }
}
