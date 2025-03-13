package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Jungol_566 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int prevPreve = 100;
        int prev = sc.nextInt();
        int answer = 0;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(prevPreve);
        list.add(prev);

        while (true) {
            answer = prevPreve - prev;
            prevPreve = prev;
            prev = answer;
            list.add(answer);
            if (answer < 0) break;
        }

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