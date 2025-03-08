package jungol;

import java.io.*;

public class Jungol_540 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int num = Integer.parseInt(br.readLine());

            if (num == -1) {
                break;
            } else if (num % 3 == 0) {
                bw.write(num / 3 + "\n");
                bw.flush();
            }
        }

        bw.close();
    }
}
