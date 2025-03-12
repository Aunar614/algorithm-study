package jungol.stepping.loop;

import java.io.*;

public class Jungol_120 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String number = br.readLine();
        String[] numbers = number.split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        bw.write((max - min) + "");

        br.close();
        bw.close();
    }
}
