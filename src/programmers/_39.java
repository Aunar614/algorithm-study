package programmers;

import java.util.Arrays;

public class _39 {

    public static void main(String[] args) {
        int a = 3;
        int d = 4;
        boolean[] included = {true, false, false, true, true};
    }

    public int solution(int a, int d, boolean[] included) {
        int[] checkNum = new int[included.length];
        int count = 0;
        int answer = 0;

        for (int i = 0; i < included.length; i++) {
            checkNum[i] = a + (d * count);
            if (included[i]) {
                answer += checkNum[i];
            }
            count++;
        }

        return answer;
    }
}
