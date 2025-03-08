package jungol;

import java.io.*;
import java.util.Calendar;

public class Jungol_124 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int month = Integer.parseInt(br.readLine()) - 1;

        Calendar cal = Calendar.getInstance();
        cal.set(2025, month, 1);
        bw.write(cal.getActualMaximum(Calendar.DAY_OF_MONTH) + "");

        br.close();
        bw.close();
    }
}
