package jungol;

import java.io.*;

public class Jungol_9019 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("5개의 수를 입력하시오. ");
        bw.flush();
        String number = br.readLine();
        String[] numbers = number.split(" ");

        int a = Integer.parseInt(numbers[0]) + 3;
        int b = Integer.parseInt(numbers[1]) - 3;
        int c = Integer.parseInt(numbers[2]) * 3;
        int d = Integer.parseInt(numbers[3]) / 3;
        int e = Integer.parseInt(numbers[4]) % 3;

        bw.write(String.format("%d %d %d %d %d", a, b, c, d, e));

        br.close();
        bw.close();
    }
}
