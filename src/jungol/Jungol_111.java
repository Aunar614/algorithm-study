package jungol;

import java.io.*;

public class Jungol_111 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String score = br.readLine();
        String[] scores = score.split(" ");

        int sum = 0;
        for (String s : scores) {
            int a = Integer.parseInt(s);
            sum += a;
        }
        int avg = sum / scores.length;

        bw.write("sum " + sum + "\n");
        bw.write("avg " + avg);

        br.close();
        bw.close();
    }
}
