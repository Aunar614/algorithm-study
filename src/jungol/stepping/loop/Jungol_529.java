package jungol.stepping.loop;

import java.io.*;

public class Jungol_529 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String number = br.readLine();
        String[] numbers = number.split(" ");

        int height = Integer.parseInt(numbers[0]);
        int weight = Integer.parseInt(numbers[1]);

        int bmi = weight + 100 - height;

        bw.write(bmi + "\n");
        if (bmi > 0) {
            bw.write("Obesity");
        }

        br.close();
        bw.close();
    }
}
