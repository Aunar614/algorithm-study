package jungol;

import java.io.*;

public class Jungol_525 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String number = br.readLine();
        String[] numbers = number.split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int c = Integer.parseInt(numbers[2]);

        boolean compare1 = a > b && a > c;
        boolean compare2 = a == b && a == c;

        bw.write(compare1 + " " + compare2);

        br.close();
        bw.close();
    }
}
