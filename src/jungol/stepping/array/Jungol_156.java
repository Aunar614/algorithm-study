package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Jungol_156 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int i = sc.nextInt();
            if (i == 999) {
                break;
            }
            list.add(i);
        }

        list.sort(Comparator.naturalOrder());
        bw.write("max : " + list.getLast() + "\n");
        bw.write("min : " + list.getFirst());

        sc.close();
        bw.close();
    }
}