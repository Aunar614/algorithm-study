package jungol.stepping.operator;

import java.io.*;

public class Jungol_115 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String number1 = br.readLine();
        String number2 = br.readLine();
        String[] numbers1 = number1.split(" ");
        String[] numbers2 = number2.split(" ");

        int aHeight = Integer.parseInt(numbers1[0]);
        int aWeight = Integer.parseInt(numbers1[1]);

        int bHeight = Integer.parseInt(numbers2[0]);
        int bWeight = Integer.parseInt(numbers2[1]);

        boolean compare = aHeight > bHeight && aWeight > bWeight;

        bw.write(String.valueOf(compare));

        br.close();
        bw.close();
    }
}
