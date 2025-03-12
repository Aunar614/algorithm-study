package jungol.stepping.loop;

import java.io.*;

public class Jungol_633 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            bw.write("1. Korea\n");
            bw.write("2. USA\n");
            bw.write("3. Japan\n");
            bw.write("4. China\n");
            bw.write("number? ");
            bw.flush();

            int num = Integer.parseInt(br.readLine());
            bw.write("\n");

            switch (num) {
                case 1 -> bw.write("Seoul\n\n");
                case 2 -> bw.write("Washington\n\n");
                case 3 -> bw.write("Tokyo\n\n");
                case 4 -> bw.write("Beijing\n\n");
                default -> bw.write("none");
            }
            bw.flush();

            if (num > 4 || num <= 0) break;
        }

        bw.close();
    }
}
