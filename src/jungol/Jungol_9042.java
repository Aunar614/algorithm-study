package jungol;

import java.io.*;

public class Jungol_9042 {

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

            if (i == 0) {
                break;
            }

            sum += i;
            count++;
        }

        double avg = (double) sum / count;
        bw.write("입력된 자료의 개수 = " + count + "\n");
        bw.write("입력된 자료의 합계 = " + sum + "\n");
        bw.write("입력된 자료의 평균 = " + String.format("%.2f", avg));

        bw.close();
    }
}
