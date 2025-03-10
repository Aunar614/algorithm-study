package jungol;

import java.io.*;

public class Jungol_136 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 10; i++) {
            bw.write(n * i + "");
            if (i < 10) {
                bw.write(" ");
            }
        }

        bw.close();
    }
}
