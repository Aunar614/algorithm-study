package jungol;

import java.io.*;

public class Jungol_148 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < count; j++) {
                bw.write("#");
                if (j < count - 1) {
                    bw.write(" ");
                }
            }
            bw.write("\n");
            count++;
        }

        count -= 2;
        int blank = 2;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < blank; j++) {
                bw.write(" ");
            }

            for (int j = 0; j < count; j++) {
                bw.write("#");
                if (j < count - 1) {
                    bw.write(" ");
                }
            }
            if (i < n - 2) {
                bw.write("\n");
            }
            count--;
            blank += 2;
        }

        br.close();
        bw.close();
    }
}