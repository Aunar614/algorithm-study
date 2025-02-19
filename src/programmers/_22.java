package programmers;

import java.util.Arrays;

public class _22 {

    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};

    }

    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int count = 0;

        for (int i = num_list.length - 1; i >= 0; i--) {
            answer[count] = num_list[i];
            count++;
        }

       return answer;
    }
}
