package jungol;

import java.io.*;

public class Jungol_518 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String number = br.readLine();
        String[] numbers = number.split(" ");

        int sum = 0;
        for (String s : numbers) {
            sum += Integer.parseInt(s);
        }

        int average = sum / numbers.length;

        bw.write("sum : " + sum + "\n");
        bw.write("avg : " + average);

        br.close();
        bw.close();
    }
}
