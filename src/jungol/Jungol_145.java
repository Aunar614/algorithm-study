package jungol;

import java.io.*;

public class Jungol_145 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int blank = 2 * (n - 1);
        int count = 1;
        for (int i = 0; i < n; i++) {
            int startNum = 1;
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
            count++;
            blank -= 2;
        }

        br.close();
        bw.close();
    }
}