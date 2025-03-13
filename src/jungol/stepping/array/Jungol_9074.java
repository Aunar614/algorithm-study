package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class Jungol_9074 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer, Integer> map = new HashMap<>();
        while (true) {
            int i = sc.nextInt();
            if (i > 10 || i < 1) {
                break;
            }
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            bw.write(entry.getKey() + " : " + entry.getValue() + "개\n");
        }

        sc.close();
        bw.close();
    }
}