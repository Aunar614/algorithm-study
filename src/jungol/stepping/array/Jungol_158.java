package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Jungol_158 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int i = sc.nextInt();
            if (i == 0) {
                break;
            } else if (i % 2 == 0) {
                list.add(i / 2);
            } else {
                list.add(i * 2);
            }
        }

        bw.write(list.size() + "\n");
        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i) + "");
            if (i < list.size() - 1) {
                bw.write(" ");
            }
        }

        sc.close();
        bw.close();
    }
}