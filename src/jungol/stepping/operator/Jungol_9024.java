package jungol.stepping.operator;

import java.io.*;

public class Jungol_9024 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String number = br.readLine();
        String[] numbers = number.split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int c = Integer.parseInt(numbers[2]);

        boolean[] compares = new boolean[4];
        compares[0] = a > b;
        compares[1] = b >= c;
        compares[2] = a <= b;
        compares[3] = b < c;

        for (int i = 0; i < compares.length; i++) {
            if (compares[i]) {
                bw.write(1 + "");
            } else {
                bw.write(0 + "");
            }
            if (i < compares.length - 1) {
                bw.write(" ");
            }
        }

        br.close();
        bw.close();
    }
}
