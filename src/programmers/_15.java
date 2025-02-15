package programmers;

import java.util.Arrays;

public class _15 {

    public static void main(String[] args) {
        int n = 15;

    }

    class Solution {
        public int[] solution(int n) {
            int m = 0;
            if (n % 2 == 0) {
                m = n / 2;
            } else {
                m = n / 2 + 1;
            }

            int[] answer = new int[m];
            int num = 1;

            for (int i = 0; i < answer.length; i++) {
                answer[i] = num;
                num += 2;
            }
            Arrays.sort(answer);

            return answer;
        }
    }
}
