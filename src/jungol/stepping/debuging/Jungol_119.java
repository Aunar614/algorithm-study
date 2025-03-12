package jungol.stepping.debuging;

import java.io.*;
import java.util.Calendar;

public class Jungol_119 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Calendar cal = Calendar.getInstance();

        int a = 0;
        a = cal.get(Calendar.YEAR) - 1900;
        a += cal.get(Calendar.MONTH);
        a += cal.get(Calendar.DATE);

        bw.write("a " + a);
        bw.write(String.format("%d %d %d", 0, 125, 134));

        bw.close();
    }
}
