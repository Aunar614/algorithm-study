package jungol.stepping.loop;

import java.io.*;

public class Jungol_550 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("*");
        }

        for (int i = 0; i < n; i++) {
            bw.write(String.valueOf(sb) + "\n");
            int index = sb.lastIndexOf("*");
            sb.deleteCharAt(index);
        }

        for (int i = 0; i < n; i++) {
            sb.append("*");
            bw.write(String.valueOf(sb));
            if (i < n - 1) {
                bw.write("\n");
            }
        }

        br.close();
        bw.close();
    }
}
