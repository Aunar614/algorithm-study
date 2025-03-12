package jungol;

import java.io.*;

public class Jungol_554 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int startStr = 65;
        int startNum = 1;

        int arrayNum = n;
        int arrayStr = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arrayNum; j++) {
                bw.write(startNum + " ");
                startNum++;
            }

            for (int j = 0; j < arrayStr; j++) {
                bw.write((char) startStr);
                if (j < arrayStr - 1) {
                    bw.write(" ");
                }
                startStr++;
            }

            if (i < n - 1) {
                bw.write("\n");
            }
            arrayNum--;
            arrayStr++;
        }

        br.close();
        bw.close();
    }
}
