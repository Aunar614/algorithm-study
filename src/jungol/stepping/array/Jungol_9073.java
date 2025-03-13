package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Jungol_9073 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }

        list.sort(Comparator.reverseOrder());
        for (int i = 0; i < 10; i++) {
            bw.write(list.get(i) + "");
            if (i < 9) {
                bw.write(" ");
            }
        }

        sc.close();
        bw.close();
    }
}