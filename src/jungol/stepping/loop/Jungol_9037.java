package jungol.stepping.loop;

import java.io.*;

public class Jungol_9037 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("점수를 입력하세요. ");
        bw.flush();
        int score = Integer.parseInt(br.readLine());

        if (score >= 90) {
            bw.write("A");
        } else if (score >= 80) {
            bw.write("B");
        } else if (score >= 70) {
            bw.write("C");
        } else if (score >= 60) {
            bw.write("D");
        } else {
            bw.write("F");
        }

        br.close();
        bw.close();
    }
}
