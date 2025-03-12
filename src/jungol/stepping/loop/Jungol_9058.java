package jungol.stepping.loop;

import java.io.*;

public class Jungol_9058 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append("*");
            bw.write(String.format("%5s", sb));
            if (i < n - 1) {
                bw.write("\n");
            }
        }

        br.close();
        bw.close();
    }
}
