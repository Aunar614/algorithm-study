package jungol;

import java.io.*;

public class Jungol_530 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int age = Integer.parseInt(br.readLine());

        if (age >= 20) {
            bw.write("adult");
        } else {
            int leftAge = 20 - age;
            bw.write(leftAge + " years later");
        }

        br.close();
        bw.close();
    }
}
