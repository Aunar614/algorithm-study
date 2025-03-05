package jungol;

import java.io.*;

public class Jungol_516 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());
        String c = br.readLine();

        bw.write(String.format("%.2f", a) + "\n");
        bw.write(String.format("%.2f", b) + "\n");
        bw.write(c);

        br.close();
        bw.close();
    }
}
