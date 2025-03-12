package jungol.stepping.loop;

import java.io.*;

public class Jungol_138 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                bw.write(String.format("(%d, %d)", i, j));
                if (j < n) {
                    bw.write(" ");
                }
            }
            bw.write("\n");
        }

        bw.close();
    }
}
