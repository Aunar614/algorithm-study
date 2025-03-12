package jungol.stepping.loop;

import java.io.*;

public class Jungol_146 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int startN = n;
        int endN = 0;

        int startStr = 65;
        int startInt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < startN; j++) {
                bw.write((char) startStr);
                if (j < startN - 1) {
                    bw.write(" ");
                }
                startStr++;
            }

            for (int j = 0; j < endN; j++) {
                bw.write(" " + startInt);

                startInt++;
            }

            if (i < n - 1) {
                bw.write("\n");
            }
            startN--;
            endN++;
        }


        br.close();
        bw.close();
    }
}