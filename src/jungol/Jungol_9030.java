package jungol;

import java.io.*;

public class Jungol_9030 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        bw.write(a + "\n");
        if (a > 10) {
            bw.write("10보다 큰 수를 입력하셨습니다.");
        }

        br.close();
        bw.close();
    }
}
