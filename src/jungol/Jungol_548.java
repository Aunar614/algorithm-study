package jungol;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Jungol_548 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 5;

        for (int i = 2; i <= 4; i++) {
            for (int j = 1; j <= max; j++) {
                bw.write(i + " * " + j + " =" + String.format("%3d", i * j));
                if (j < max) {
                    bw.write("   ");
                }
            }
            bw.write("\n");
        }

        bw.close();
    }
}
