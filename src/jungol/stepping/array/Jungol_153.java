package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Jungol_153 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int i = sc.nextInt();
            if (i == -1) {
                break;
            }
            list.add(i);
        }

        if (list.size() >= 3) {
            int last2 = list.get(list.size() - 1);
            int last1 = list.get(list.size() - 2);
            int last = list.get(list.size() - 3);

            bw.write(last + " " + last1 + " " + last2);
        } else if (list.size() >= 2) {
            bw.write(list.get(0) + " " + list.get(1));
        } else if (list.size() >= 1) {
            bw.write(list.getFirst() + "");
        }
        sc.close();
        bw.close();
    }
}