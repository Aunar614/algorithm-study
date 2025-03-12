package jungol.stepping.loop;

import java.io.*;

public class Jungol_129 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            bw.write("Base = ");
            bw.flush();
            int base = Integer.parseInt(br.readLine());

            bw.write("Height = ");
            bw.flush();
            int height = Integer.parseInt(br.readLine());

            double triangleWidth = ((double) base * height) / 2;
            bw.write("Triangle width = " + String.format("%.1f", triangleWidth) + "\n");
            bw.write("Continue? ");
            bw.flush();

            String str = br.readLine().toUpperCase();
            if (!str.equals("Y")) {
                break;
            }
        }

        br.close();
        bw.close();
    }
}
