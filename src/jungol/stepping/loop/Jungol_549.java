package jungol.stepping.loop;

import java.io.*;

public class Jungol_549 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int count = 0;
        int sum = 0;
        int sumNum = 0;
        while (sum < n) {
            if (sumNum % 2 != 0) {
                sum += sumNum;
                count++;
            }
            sumNum++;
        }

        bw.write(count + " " + sum);

        bw.close();
    }
}
