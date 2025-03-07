package jungol;

import java.io.*;

public class Jungol_9027 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String number = br.readLine();
        String[] numbers = number.split(" ");

        double a = Double.parseDouble(numbers[0]);
        double b = Double.parseDouble(numbers[1]);

        int sum1 = (int) Math.round(a + b);

        // Math.floor() 소수점 버리기 활용
        int num1 = (int) Math.floor(a);
        int num2 = (int) Math.floor(b);

        int sum2 = num1 + num2;

        bw.write(sum1 + " " + sum2);

        br.close();
        bw.close();
    }
}
