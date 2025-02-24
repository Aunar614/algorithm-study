package programmers;

import java.util.ArrayList;
import java.util.List;

public class _49 {

    public static void main(String[] args) {
        int n = 10;
    }

    public int[] solution(int n) {
        List<Integer> temp = new ArrayList<>();
        temp.add(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                temp.add(n);
            } else if (n % 2 != 0) {
                n = 3 * n + 1;
                temp.add(n);
            }
        }

        int[] answer = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }

        return answer;
    }
}
