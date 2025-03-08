package jungol;

import java.io.*;

public class Jungol_533 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String number = br.readLine();
        String[] numbers = number.split(" ");

        String gender = numbers[0];
        int age = Integer.parseInt(numbers[1]);

        if (gender.equals("M")) {
            if (age >= 18) {
                bw.write("MAN");
            } else {
                bw.write("BOY");
            }
        } else if (gender.equals("F")) {
            if (age >= 18) {
                bw.write("WOMAN");
            } else {
                bw.write("GIRL");
            }
        }

        br.close();
        bw.close();
    }
}
