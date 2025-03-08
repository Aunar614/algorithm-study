package jungol;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Jungol_9039 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 65; i < 91; i++) {
            bw.write((char) i);
        }

        bw.close();
    }
}
