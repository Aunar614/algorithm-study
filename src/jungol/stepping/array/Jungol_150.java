package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Jungol_150 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(sc.next());
        }

        ArrayList<String> strings = new ArrayList<>();
        for (int i = 9; i >= 0; i--) {
            strings.add(list.get(i));
        }

        for (int i = 0; i < 10; i++) {
            bw.write(strings.get(i));
            if (i < 9) {
                bw.write(" ");
            }
        }

        sc.close();
        bw.close();
    }
}