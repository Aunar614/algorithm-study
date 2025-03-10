package jungol;

import java.io.*;

public class Jungol_139 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        String[] number = num.split(" ");

        int n = Integer.parseInt(number[0]);
        int m = Integer.parseInt(number[1]);

        if (n >= m) {
            for (int i = 1; i < 10; i++) {
                for (int j = n; j >= m; j--) {
                    bw.write(String.format("%d * %d = %2d", j, i, j * i));
                    if (j > m) {
                        bw.write("   ");
                    }
                }
                bw.write("\n");
            }
        } else if (n < m) {
            for (int i = 1; i < 10; i++) {
                for (int j = n; j <= m; j++) {
                    bw.write(String.format("%d * %d = %2d", j, i, j * i));
                    if (j < m) {
                        bw.write("   ");
                    }
                }
                bw.write("\n");
            }
        }

        bw.close();
    }
}
