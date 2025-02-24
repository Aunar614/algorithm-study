package programmers;

import java.util.ArrayList;
import java.util.List;

public class _48 {

    public static void main(String[] args) {
        int start_num = 3;
        int end_num = 10;
    }

    public int[] solution(int start_num, int end_num) {
        List<Integer> temp = new ArrayList<>();
        for (int i = start_num; i <= end_num; i++) {
            temp.add(i);
        }

        int[] answer = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }

        return answer;
    }
}
