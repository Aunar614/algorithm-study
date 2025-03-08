package jungol;

import java.io.*;

public class Jungol_126 {

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
        int odd = 0;
        int even = 0;
        while (true) {
            int i = numbers[count];
            if (i == 0) {
                break;
            }

            if (i % 2 == 0) {
                even++;
            } else if (i % 2 != 0) {
                odd++;
            }
            count++;
        }

        bw.write("odd : " + odd + "\n");
        bw.write("even : " + even);

        bw.close();
    }
}
