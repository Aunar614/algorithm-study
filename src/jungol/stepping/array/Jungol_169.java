package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Jungol_169 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[][] strings = new String[3][5];
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                String str = sc.next().toLowerCase();
                strings[i][j] = str;
            }
        }

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                bw.write(strings[i][j]);
                if (j < strings[i].length - 1) {
                    bw.write(" ");
                }
            }
            if (i < strings.length - 1) {
                bw.write("\n");
            }
        }

        sc.close();
        bw.close();
    }
}
