package programmers;

import java.util.Arrays;

public class _43 {

    public static void main(String[] args) {
        int[] num_list = {5, 2, 1, 7, 5};
    }

    public int[] solution(int[] num_list) {
        int num1 = num_list.length - 1;
        int num2 = num_list.length - 2;

        int checkNum = num_list[num1] > num_list[num2] ? num_list[num1] - num_list[num2] : num_list[num1] * 2;
        int[] answer = new int[num_list.length + 1];

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        answer[answer.length - 1] = checkNum;
        return answer;
    }
}
