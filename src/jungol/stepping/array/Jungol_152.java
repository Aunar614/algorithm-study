package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Jungol_152 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> list = new ArrayList<>();
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }

        for (int i = 0; i < 10; i += 2) {
            sumOdd += list.get(i);
        }

        for (int i = 1; i < 10; i += 2) {
            sumEven += list.get(i);
        }

        bw.write("odd : " + sumOdd + "\n");
        bw.write("even : " + sumEven);

        sc.close();
        bw.close();
    }
}