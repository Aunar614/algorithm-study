package jungol.stepping.operator;

import java.io.*;

public class Jungol_524 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String number = br.readLine();
        String[] numbers = number.split(" ");

        int[] num = new int[2];
        num[0] = Integer.parseInt(numbers[0]);
        num[1] = Integer.parseInt(numbers[1]);

        boolean compare1 = (num[0] != 0) && (num[1] != 0);
        boolean compare2 = (num[0] != 0) || (num[1] != 0);

        bw.write(String.format("%b %b", compare1, compare2));

        br.close();
        bw.close();
    }
}
