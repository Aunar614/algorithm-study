package programmers;

public class _12 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 100, -99, 1, 2, 3};

    }

    class Solution {
        public int[] solution(int[] numbers) {
            int[] answer = new int[numbers.length];

            for (int i = 0; i < numbers.length; i++) {
                answer[i] = numbers[i] * 2;
            }

            return answer;
        }
    }
}
