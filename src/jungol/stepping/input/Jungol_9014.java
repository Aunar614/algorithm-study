package jungol.stepping.input;

import java.io.*;

public class Jungol_9014 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("당신의 나이는 몇 살 입니까? ");
        bw.flush();
        int age = Integer.parseInt(br.readLine());

        bw.write("당신의 나이는 " + age + "살 이군요.");

        br.close();
        bw.close();
    }
}
