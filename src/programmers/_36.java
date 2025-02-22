package programmers;

import java.util.Arrays;

public class _36 {

    public static void main(String[] args) {
        int[] emergency = {3, 76, 24};
    }

    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int count = 1;

        int[] copied = emergency.clone();
        Arrays.sort(copied);

        for (int i = copied.length - 1; i >= 0; i--) {
            for (int j = 0; j < emergency.length; j++) {
                if (copied[i] == emergency[j]) {
                    answer[j] = count;
                    count++;
                }
            }
        }

        return answer;
    }
}
