package jungol;

import java.io.*;
import java.util.GregorianCalendar;

public class Jungol_122 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(br.readLine());

        GregorianCalendar gc = new GregorianCalendar();

        if (gc.isLeapYear(year)) {
            bw.write("leap year");
        } else {
            bw.write("common year");
        }

        br.close();
        bw.close();
    }
}
