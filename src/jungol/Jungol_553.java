package jungol;

import java.io.*;

public class Jungol_553 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int startNum = 65;
        int count = n;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < count; j++) {
                bw.write((char) startNum);
                startNum++;
            }

            if (i < n - 1) {
                bw.write("\n");
            }
            count--;
        }

        br.close();
        bw.close();
    }
}
