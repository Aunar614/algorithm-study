package jungol.stepping.loop;

import java.io.*;

public class Jungol_538 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            bw.write("number? ");
            bw.flush();
            int number = Integer.parseInt(br.readLine());

            if (number == 0) {
                break;
            } else if (number > 0) {
                bw.write("positive integer\n");
                bw.flush();
            } else if (number < 0) {
                bw.write("negative number\n");
                bw.flush();
            }
        }

        bw.close();
    }
}
