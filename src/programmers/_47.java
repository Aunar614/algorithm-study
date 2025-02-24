package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class _47 {

    public static void main(String[] args) {
        int l = 5;
        int r = 555;
    }

    public int[] solution(int l, int r) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            String checkNum = String.valueOf(i);
            String[] numbers = checkNum.split("");
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j].equals("0") || numbers[j].equals("5")) {
                    count++;
                }
            }
            if (count == numbers.length) {
                temp.add(i);
            }
        }

        if (temp.isEmpty()) {
            return new int[]{-1};
        }

        int[] answer = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }

        return answer;
    }
}
