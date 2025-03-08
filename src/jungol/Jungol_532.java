package jungol;

import java.io.*;

public class Jungol_532 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String number = br.readLine();
        String[] numbers = number.split(" ");

        double score1 = Double.parseDouble(numbers[0]);
        double score2 = Double.parseDouble(numbers[1]);

        double a = 4.0;
        double b = 3.0;

        if (score1 >= a && score2 >= a) {
            bw.write("A");
        } else if (score1 >= b && score2 >= b) {
            bw.write("B");
        } else {
            bw.write("C");
        }

        br.close();
        bw.close();
    }
}
