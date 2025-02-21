package programmers;

import java.util.ArrayList;

public class _34 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int num1 = 1;
        int num2 = 3;
    }

    public ArrayList<Integer> solution(int[] numbers, int num1, int num2) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = num1; i <= num2; i++) {
            answer.add(numbers[i]);
        }

        return answer;
    }
}
