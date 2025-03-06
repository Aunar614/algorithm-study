package jungol;

import java.io.*;

public class Jungol_522 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String number = br.readLine();
        String[] numbers = number.split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        boolean compare1 = a == b;
        boolean compare2 = a != b;

        if (compare1) {
            bw.write(1 + "\n");
        } else {
            bw.write(0 + "\n");
        }
        if (compare2) {
            bw.write(1 + "");
        } else {
            bw.write(0 + "");
        }

        br.close();
        bw.close();
    }
}
