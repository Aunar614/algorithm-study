package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class Jungol_161 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer, Integer> scores = new HashMap<>();

        while (true) {
            int score = sc.nextInt();
            if (score == 0) {
                break;
            }
            score -= score % 10;
            scores.put(score, scores.getOrDefault(score, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(scores.keySet());
        list.sort(Comparator.reverseOrder());

        for (Integer key : list) {
            bw.write(key + " : " + scores.get(key) + " person\n");
        }

        sc.close();
        bw.close();
    }
}