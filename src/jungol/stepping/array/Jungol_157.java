package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Jungol_157 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int i = sc.nextInt();
            if (i == 0) {
                break;
            }
            list.add(i);
        }

        int count5 = 0;
        int sum = 0;
        for (Integer integer : list) {
            if (integer % 5 == 0) {
                count5++;
                sum += integer;
            }
        }

        double avg = (double) sum / count5;

        bw.write("Multiples of 5 : " + count5 + "\n");
        bw.write("sum : " + sum + "\n");
        bw.write("avg : " + String.format("%.1f", avg));

        sc.close();
        bw.close();
    }
}