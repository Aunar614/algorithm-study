package jungol.stepping.operator;

import java.io.*;

public class Jungol_519 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String number = br.readLine();
        String[] numbers = number.split(" ");

        int a = Integer.parseInt(numbers[0]) + 100;
        int b = Integer.parseInt(numbers[1]) % 10;

        bw.write(a + " " + b);

        br.close();
        bw.close();
    }
}
