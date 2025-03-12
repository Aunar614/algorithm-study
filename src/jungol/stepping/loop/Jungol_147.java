package jungol.stepping.loop;

import java.io.*;

public class Jungol_147 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int blank = 0;
        int startNum = 1;
        int count = n;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < blank; j++) {
                bw.write(" ");
            }

            for (int j = 0; j < count; j++) {
                bw.write(startNum + "");
                if (j < count - 1) {
                    bw.write(" ");
                }
                startNum++;
            }

            if (i < n - 1) {
                bw.write("\n");
            }
            blank += 2;
            count--;
        }

        br.close();
        bw.close();
    }
}