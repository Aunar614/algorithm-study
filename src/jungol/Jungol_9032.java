package jungol;

import java.io.*;

public class Jungol_9032 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("점수를 입력하세요. ");
        bw.flush();
        int score = Integer.parseInt(br.readLine());

        if (score > 80) {
            bw.write("축하합니다. 합격입니다.");
        } else {
            bw.write("죄송합니다. 불합격입니다.");
        }

        br.close();
        bw.close();
    }
}
