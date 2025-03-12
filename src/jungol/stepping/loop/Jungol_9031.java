package jungol.stepping.loop;

import java.io.*;

public class Jungol_9031 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String number = br.readLine();
        String[] numbers = number.split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        if (a > b) {
            bw.write("입력받은 수 중 큰 수는 " + a + "이고 작은 수는 " + b + "입니다.");
        } else if (a < b) {
            bw.write("입력받은 수 중 큰 수는 " + b + "이고 작은 수는 " + a + "입니다.");
        }

        br.close();
        bw.close();
    }
}
