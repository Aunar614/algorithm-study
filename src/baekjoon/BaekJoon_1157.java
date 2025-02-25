package baekjoon;

import java.util.*;

public class BaekJoon_1157 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine().toUpperCase();
        String[] words = word.split("");
        int max = 0;

        Map<String, Integer> map = new HashMap<>();
        for (String string : words) {
            Integer count = map.get(string);
            if (count == null) {
                count = 0;
            }
            count++;
            map.put(string, count);
            if (max < map.get(string)) {
                max = map.get(string);
            }
        }

        int cnt = 0;
        String answer = "?";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(max)) {
                cnt++;
                answer = entry.getKey();
            }
        }
        System.out.println(cnt > 1 ? "?" : answer);
    }
}
