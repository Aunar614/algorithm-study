package programmers;

import java.util.stream.IntStream;

public class _17 {

    public static void main(String[] args) {
        int n = 4;
        int pizza = 6;
        int answer = 1;
        int temp = 0;

        while (true) {
            temp = pizza * answer;
            if (temp % n == 0) {
                break;
            }
            answer++;
        }
        System.out.println(answer);
    }

    public int solution(int n) {
        int pizza = 6;
        int answer = 1;
        int temp = 0;

        while (true) {
            temp = pizza * answer;
            if (temp % n == 0) {
                break;
            }
            answer++;
        }
        return answer;
    }
}
