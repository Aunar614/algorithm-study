package jungol.stepping.array;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Jungol_9068 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        String[] number = num.split(" ");
        List<String> strings = new ArrayList<>();

        int count = 0;
        while (true) {
            String str = number[count];
            if (str.equals("0")) {
                break;
            }
            if (count % 2 != 0) {
                strings.add(str);
            }
            count++;
        }

        for (int i = 0; i < strings.size(); i++) {
            bw.write(strings.get(i));
            if (i < strings.size() - 1) {
                bw.write(" ");
            }
        }

        br.close();
        bw.close();
    }
}