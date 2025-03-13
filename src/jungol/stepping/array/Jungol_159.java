package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Jungol_159 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int student = sc.nextInt();
        ArrayList<Integer> scores = new ArrayList<>();
        for (int i = 0; i < student; i++) {
            scores.add(sc.nextInt());
        }

        scores.sort(Comparator.reverseOrder());
        for (int i = 0; i < student; i++) {
            bw.write(scores.get(i) + "");
            if (i < student - 1) {
                bw.write("\n");
            }
        }

        sc.close();
        bw.close();
    }
}