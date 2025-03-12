package jungol.stepping.loop;

import java.io.*;

public class Jungol_551 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int count = 0;
        int strCount = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < count; j++) {
                bw.write(" ");
            }

            for (int j = 0; j < strCount; j++) {
                bw.write("*");
            }
            if (i < n - 1) {
                bw.write("\n");
            }
            count++;
            strCount--;
        }

        br.close();
        bw.close();
    }
}
