package jungol.stepping.loop;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Jungol_9054 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 9;

        for (int i = 1; i <= max; i++) {
            for (int j = 2; j <= 4; j++) {
                bw.write(j + " * " + i + " =" + String.format("%3d", j * i));
                if (j < 4) {
                    bw.write("   ");
                }
            }
            bw.write("\n");
        }

        bw.close();
    }
}
