package jungol.stepping.loop;

import java.io.*;

public class Jungol_149 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int startNum = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (startNum > 10) {
                    startNum = 1;
                }
                bw.write(startNum + "");
                startNum += 2;
                if (j < n - 1) {
                    bw.write(" ");
                }
            }
            if (i < n - 1) {
                bw.write("\n");
            }
        }

        br.close();
        bw.close();
    }
}