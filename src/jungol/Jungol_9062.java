package jungol;

import java.io.*;

public class Jungol_9062 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int startChar = 97;
        int startNum = 1;

        int startInt = 5;
        int startStr = 1;

        for (int i = 0; i < 4; i++) {
            int checkNum = startInt - startStr;
            for (int j = 0; j < startStr; j++) {
                bw.write((char) startChar + " ");
                startChar++;
            }

            for (int j = 0; j < checkNum; j++) {
                bw.write(startNum + "");
                if (j < checkNum - 1) {
                    bw.write(" ");
                }
                startNum++;
            }

            if (i < 3) {
                bw.write("\n");
            }
            startStr++;
        }

        br.close();
        bw.close();
    }
}
