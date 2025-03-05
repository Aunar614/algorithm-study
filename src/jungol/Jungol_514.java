package jungol;

import java.io.*;

public class Jungol_514 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("height = ");
        bw.flush();
        int height = Integer.parseInt(br.readLine());

        bw.write("Your height is " + height + "cm.");

        br.close();
        bw.close();
    }
}
