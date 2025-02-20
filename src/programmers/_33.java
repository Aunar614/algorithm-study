package programmers;

public class _33 {

    public static void main(String[] args) {
        int n = 4;
        int totalSum = 0;
    }

    public int solution(int n) {
        int answer = 0;

        for (int i = n; i > 0; i--) {
            if (i % 2 == 0) {
                answer += i;
            }
        }

        return answer;
    }
}
