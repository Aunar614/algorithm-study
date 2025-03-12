package jungol.stepping.loop;

import java.io.*;

public class Jungol_123 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("Number? ");
        bw.flush();
        int number = Integer.parseInt(br.readLine());

        switch (number) {
            case 1 -> bw.write("dog");
            case 2 -> bw.write("cat");
            case 3 -> bw.write("chick");
            default -> bw.write("I don't know.");
        }

        br.close();
        bw.close();
    }
}
