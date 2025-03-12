package jungol;

import java.io.*;

public class Jungol_143 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int m = n * 2 - 1;
        sb.append("*".repeat(Math.max(0, m)));

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < count; j++) {
                bw.write(" ");
            }

            bw.write(String.valueOf(sb) + "\n");
            if (i < n - 1) {
                int index = sb.lastIndexOf("*");
                sb.deleteCharAt(index);
                sb.deleteCharAt(index - 1);
            }
            count++;
        }

        count -= 1;
        for (int i = 0; i < n - 1; i++) {
            count--;
            for (int j = 0; j < count; j++) {
                bw.write(" ");
            }

            sb.append("**");
            bw.write(String.valueOf(sb));

            if (i < n - 1) {
                bw.write("\n");
            }
        }

        br.close();
        bw.close();
    }
}