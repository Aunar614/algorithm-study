package jungol;

import java.io.*;

public class Jungol_131 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        String[] numbers = num.split(" ");

        int n = Integer.parseInt(numbers[0]);
        int m = Integer.parseInt(numbers[1]);

        int startNum = Math.min(n, m);
        int endNum = Math.max(n, m);

        for (int i = startNum; i <= endNum; i++) {
            bw.write(i + "");
            if (i < endNum) {
                bw.write(" ");
            }
        }

        bw.close();
    }
}
