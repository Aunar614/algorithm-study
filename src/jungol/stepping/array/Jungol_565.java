package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Jungol_565 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<Integer, Integer> map = new HashMap<>();
        while (true) {
            int i = sc.nextInt();
            if (i == 0) break;

            int j = i / 10;
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        list.sort(Comparator.naturalOrder());

        for (Integer i : list) {
            bw.write(i + " : " + map.get(i) + "\n");
        }

        sc.close();
        bw.close();
    }
}