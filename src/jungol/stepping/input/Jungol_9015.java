package jungol.stepping.input;

import java.io.*;

public class Jungol_9015 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("두 수를 입력하시오. ");
        bw.flush();

        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        bw.write(a + " + " + b + " = " + (a + b) + "\n");
        bw.write(a + " * " + b + " = " + (a * b));

        br.close();
        bw.close();
    }
}
