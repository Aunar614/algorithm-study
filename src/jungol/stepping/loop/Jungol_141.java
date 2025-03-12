package jungol.stepping.loop;

import java.io.*;

public class Jungol_141 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int num = n;
        int count = 1;

        while (true) {
            num = n * count;

            if (num > 100) {
                break;
            }
            bw.write(num + "");

            if (num % 10 == 0) {
                break;
            }
            bw.write(" ");
            count++;
        }

        br.close();
        bw.close();
    }
}