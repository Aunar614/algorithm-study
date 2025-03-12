package jungol.stepping.loop;

import java.io.*;

public class Jungol_9034 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("주사위를 두 번 던진 결과를 입력하세요. ");
        bw.flush();

        String number = br.readLine();
        String[] numbers = number.split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        if (a >= 4 && b >= 4) {
            bw.write("이겼습니다.");
        } else if (a >= 4 || b >= 4) {
            bw.write("비겼습니다.");
        } else if (a < 4 && b < 4) {
            bw.write("졌습니다.");
        }

        br.close();
        bw.close();
    }
}
