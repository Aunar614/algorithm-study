package jungol.stepping.loop;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Jungol_547 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 2;
        int max = count + 5;

        for (int i = 0; i < 5; i++) {
            for (int j = count; j < max; j++) {
                bw.write(j + "");
                if (j < max - 1) {
                    bw.write(" ");
                }
            }
            bw.write("\n");
            count++;
            max++;
        }

        bw.close();
    }
}
