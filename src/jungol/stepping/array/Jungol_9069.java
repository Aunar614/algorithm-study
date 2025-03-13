package jungol.stepping.array;

import java.io.*;
import java.util.Calendar;

public class Jungol_9069 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            bw.write("YEAR = ");
            bw.flush();
            int year = Integer.parseInt(br.readLine());
            bw.write("MONTH = ");
            bw.flush();
            int month = Integer.parseInt(br.readLine());

            if (month == 0) {
                break;
            } else if (month > 12 || month < 1) {
                bw.write("잘못 입력하였습니다.\n\n");
                continue;
            }

            Calendar cal = Calendar.getInstance();

            cal.set(year, month - 1, 1);
            int lastDate = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

            bw.write("입력하신 달의 날 수는 " + lastDate + "일입니다.\n\n");
        }

        br.close();
        bw.close();
    }
}