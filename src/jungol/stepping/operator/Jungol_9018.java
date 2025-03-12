package jungol.stepping.operator;

import java.io.*;

public class Jungol_9018 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("두 개의 수를 입력하시오. ");
        bw.flush();

        String number = br.readLine();
        String[] numbers = number.split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        bw.write(a + " + " + b + " = " + (a + b) + "\n");
        bw.write(a + " - " + b + " = " + (a - b) + "\n");
        bw.write(a + " * " + b + " = " + (a * b) + "\n");
        bw.write(a + " / " + b + " = " + (a / b) + "\n");
        bw.write(a + " % " + b + " = " + (a % b));

        br.close();
        bw.close();
    }
}
