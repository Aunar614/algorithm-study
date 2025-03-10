package jungol;

import java.io.*;

public class Jungol_9053 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 1;
        int max = 5;
        // 1 1 1 1 1
        // 2 2 2 2 2
        for (int i = 0; i < max; i++) {
            for (int j = 1; j <= max ; j++) {
                bw.write(count + "");
                if (j < max) {
                    bw.write(" ");
                }
            }
            bw.write("\n");
            count++;
        }
        bw.write("\n");

        // 1 2 3 4 5
        for (int i = 0; i < max; i++) {
            for (int j = 1; j <= max ; j++) {
                bw.write(j + "");
                if (j < max) {
                    bw.write(" ");
                }
            }
            bw.write("\n");
        }
        bw.close();
    }
}
