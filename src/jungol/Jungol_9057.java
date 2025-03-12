package jungol;

import java.io.*;

public class Jungol_9057 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append("*");
            bw.write(String.valueOf(sb));
            if (i < 2) {
                bw.write("\n");
            }
        }

        bw.write("\n");
        for (int i = 0; i < 3; i++) {
            bw.write(String.valueOf(sb));
            int index = sb.lastIndexOf("*");
            sb.deleteCharAt(index);
            if (i < 2) {
                bw.write("\n");
            }
        }

        bw.close();
    }
}
