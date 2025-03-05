package jungol;

import java.io.*;

public class Jungol_515 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        bw.write(a + " * " + b + " = " + (a * b) + "\n");
        bw.write(a + " / " + b + " = " + (a / b));

        br.close();
        bw.close();
    }
}
