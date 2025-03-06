package jungol;

import java.io.*;

public class Jungol_523 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String number = br.readLine();
        String[] numbers = number.split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        boolean[] compares = new boolean[4];
        compares[0] = a > b;
        compares[1] = a < b;
        compares[2] = a >= b;
        compares[3] = a <= b;

        int[] answer = new int[4];
        for (int i = 0; i < compares.length; i++) {
            if (compares[i]) {
                answer[i] = 1;
            } else {
                answer[i] = 0;
            }
        }

        bw.write(a + " > " + b + " --- " + answer[0] + "\n");
        bw.write(a + " < " + b + " --- " + answer[1] + "\n");
        bw.write(a + " >= " + b + " --- " + answer[2] + "\n");
        bw.write(a + " <= " + b + " --- " + answer[3]);

        br.close();
        bw.close();
    }
}
