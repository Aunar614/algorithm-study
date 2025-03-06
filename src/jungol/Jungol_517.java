package jungol;

import java.io.*;

public class Jungol_517 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());
        double c = Double.parseDouble(br.readLine());

        bw.write(String.format("%.3f", a) + "\n");
        bw.write(String.format("%.3f", b) + "\n");
        bw.write(String.format("%.3f", c));

        br.close();
        bw.close();
    }
}
