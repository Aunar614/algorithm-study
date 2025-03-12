package jungol.stepping.loop;

import java.io.*;

public class Jungol_137 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        String[] number = num.split(" ");

        int n = Integer.parseInt(number[0]);
        int m = Integer.parseInt(number[1]);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                bw.write(j * i + "");
                if (j < m) {
                    bw.write(" ");
                }
            }
            bw.write("\n");
        }

        bw.close();
    }
}
