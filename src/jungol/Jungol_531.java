package jungol;

import java.io.*;

public class Jungol_531 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double weight = Double.parseDouble(br.readLine());

        if (weight <= 50.80) {
            bw.write("Flyweight");
        } else if (50.80 < weight && weight <= 61.23) {
            bw.write("Lightweight");
        } else if (61.23 < weight && weight <= 72.57) {
            bw.write("Middleweight");
        } else if (72.57 < weight && weight <= 88.45) {
            bw.write("Cruiserweight");
        } else if (weight > 88.45) {
            bw.write("Heavyweight");
        }

        br.close();
        bw.close();
    }
}
