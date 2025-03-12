package jungol.stepping.input;

import java.io.*;

public class Jungol_9016 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("키를 입력하세요. ");
        bw.flush();
        int height = Integer.parseInt(br.readLine());

        bw.write("몸무게를 입력하세요. ");
        bw.flush();
        double weight = Double.parseDouble(br.readLine());

        bw.write("이름을 입력하세요. ");
        bw.flush();
        String name = br.readLine();

        bw.write("키 = " + height + "\n");
        bw.write("몸무게 = " + String.format("%.1f", weight)+ "\n");
        bw.write("이름 = " + name);

        br.close();
        bw.close();
    }
}
