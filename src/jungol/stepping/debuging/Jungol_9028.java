package jungol.stepping.debuging;

import java.io.*;

public class Jungol_9028 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        int compare1 = a / 4;
        double compare2 = a / 4.0;

        bw.write(a + " / 4 = " + compare1 + "\n");
        bw.write(a + " / 4.0 = " + String.format("%.2f", compare2));

        br.close();
        bw.close();
    }
}
