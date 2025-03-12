package jungol;

import java.io.*;

public class Jungol_140 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        String[] number = num.split(" ");

        int[] numbers = new int[number.length];
        for (int i = 0; i < number.length; i++) {
            numbers[i] = Integer.parseInt(number[i]);
        }

        int count = 0;
        int sum = 0;
        while (true) {
            int i = numbers[count];

            if (count == 19) {
                if (i == 0) {
                    break;
                }
                sum += i;
                count++;
                break;
            } else if (i == 0) {
                break;
            }
            sum += i;
            count++;
        }
        double avg = Math.floor((double) sum / count);

        bw.write(sum + " " + (int) avg);

        br.close();
        bw.close();
    }
}