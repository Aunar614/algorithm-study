package jungol.stepping.loop;

import java.io.*;

public class Jungol_127 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String number = br.readLine();
        String[] checkNum = number.split(" ");

        int[] numbers = new int[checkNum.length];
        for (int i = 0; i < checkNum.length; i++) {
            numbers[i] = Integer.parseInt(checkNum[i]);
        }

        int count = 0;
        int sum = 0;
        while (true) {
            int i = numbers[count];
            if (i < 0 || i > 100) {
                break;
            }
            sum += i;
            count++;
        }

        double avg = (double) sum / count;

        bw.write("sum : " + sum + "\n");
        bw.write("avg : " + String.format("%.1f", avg));

        br.close();
        bw.close();
    }
}
