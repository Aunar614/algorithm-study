package jungol.stepping.loop;

import java.io.*;

public class Jungol_546 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        String num = br.readLine();
        String[] number = num.split(" ");

        int[] numbers = new int[number.length];
        for (int i = 0; i < number.length; i++) {
            numbers[i] = Integer.parseInt(number[i]);
        }

        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += numbers[i];
        }
        double avg = (double) sum / count;

        bw.write("avg : " + String.format("%.1f", avg) + "\n");

        String checkPass;
        if (avg >= 80) {
            bw.write("pass");
        } else {
            bw.write("fail");
        }

        br.close();
        bw.close();
    }
}
