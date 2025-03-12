package jungol.stepping.loop;

import java.io.*;

public class Jungol_9059 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tree = 5;
        int count = tree - 1;
        int strCount = 1;

        for (int i = 0; i < tree; i++) {
            for (int j = 0; j < count; j++) {
                bw.write(" ");
            }

            for (int j = 0; j < strCount; j++) {
                bw.write("*");
            }
            if (i < tree - 1) {
                bw.write("\n");
            }
            count--;
            strCount += 2;
        }

        br.close();
        bw.close();
    }
}
