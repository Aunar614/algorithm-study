package jungol;

import java.io.*;

public class Jungol_144 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int blank = 2 * (n - 1);

        sb.append("*");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < blank; j++) {
                bw.write(" ");
            }

            bw.write(String.valueOf(sb));
            sb.append("**");
            if (i < n - 1) {
                bw.write("\n");
            }
            blank -= 2;
        }

        br.close();
        bw.close();
    }
}