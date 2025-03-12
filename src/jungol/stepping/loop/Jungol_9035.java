package jungol.stepping.loop;

import java.io.*;
import java.util.Arrays;

public class Jungol_9035 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("세 수를 입력하세요. ");
        bw.flush();

        String number = br.readLine();
        String[] numbers = number.split(" ");

        int[] checkNum = {Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1]), Integer.parseInt(numbers[2])};
        Arrays.sort(checkNum);

        bw.write("입력받은 수 중 가장 큰 수는 " + checkNum[2] + "입니다.");

        br.close();
        bw.close();
    }
}
