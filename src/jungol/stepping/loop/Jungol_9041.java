package jungol.stepping.loop;

import java.io.*;

public class Jungol_9041 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int score = 1;

        while (true) {
            bw.write("점수를 입력하세요. ");
            bw.flush();
            score = Integer.parseInt(br.readLine());

            if (score >= 80 && score <= 100) {
                bw.write("축하합니다. 합격입니다.\n");
                bw.flush();
            } else if (score < 80 && score >= 0) {
                bw.write("죄송합니다. 불합격입니다.\n");
                bw.flush();
            } else {
                break;
            }
        }

        bw.close();
    }
}
