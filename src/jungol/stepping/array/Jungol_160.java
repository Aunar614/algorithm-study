package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jungol_160 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer, Integer> dice = new HashMap<>();
        dice.put(1, 0);
        dice.put(2, 0);
        dice.put(3, 0);
        dice.put(4, 0);
        dice.put(5, 0);
        dice.put(6, 0);

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            dice.put(n, dice.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : dice.entrySet()) {
            bw.write(entry.getKey() + " : " + entry.getValue() + "\n");
        }

        sc.close();
        bw.close();
    }
}