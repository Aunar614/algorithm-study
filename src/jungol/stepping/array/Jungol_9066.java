package jungol.stepping.array;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Jungol_9066 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            int startStr = 65 + i;
            char str = (char) startStr;
            strings.add(String.valueOf(str));
        }

        for (int i = strings.size() - 1; i >= 0; i--) {
            bw.write(strings.get(i));
            if (i > 0) {
                bw.write(" ");
            }
        }

        br.close();
        bw.close();
    }
}