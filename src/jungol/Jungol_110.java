package jungol;

import java.io.*;

public class Jungol_110 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("yard? ");
        bw.flush();
        double a = Double.parseDouble(br.readLine());
        double b = a * 91.44;

        bw.write(a + "yard = " + String.format("%.1f", b) + "cm");

        br.close();
        bw.close();
    }
}
