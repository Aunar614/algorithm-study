package jungol;

import java.io.*;

public class Jungol_9017 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("두 개의 실수를 입력하시오.\n");
        bw.flush();

        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());

        bw.write("x = " + String.format("%.2f", a) + "\n");
        bw.write("y = " + String.format("%.2f", b));

        br.close();
        bw.close();
    }
}
