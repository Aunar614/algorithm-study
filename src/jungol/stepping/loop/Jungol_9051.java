package jungol.stepping.loop;

import java.io.*;

public class Jungol_9051 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        String[] number = num.split(" ");

        int[] numbers = new int[number.length];
        for (int i = 0; i < number.length; i++) {
            numbers[i] = Integer.parseInt(number[i]);
        }

        int checkNum = 0;
        for (int i : numbers) {
            if (i % 2 == 0) {
                checkNum++;
            }
        }

        bw.write("입력받은 짝수는 " + checkNum + "개입니다.");

        br.close();
        bw.close();
    }
}
