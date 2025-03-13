package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class Jungol_564 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Character, Integer> map = new HashMap<>();
        while (true) {
            char word = sc.next().charAt(0);
            int num = word;
            if (num < 65 || num > 90) {
                break;
            }
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        for (Character key : list) {
            bw.write(key + " : " + map.get(key) + "\n");
        }

        sc.close();
        bw.close();
    }
}