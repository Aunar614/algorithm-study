package programmers;

public class _45 {

    public static void main(String[] args) {
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
    }

    public String solution(int[] numLog) {
        int init = numLog[0];
        int w = 1;
        int s = -1;
        int d = 10;
        int a = -10;

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < numLog.length - 1; i++) {
            if (numLog[i + 1] - numLog[i] == w) {
                answer.append("w");
            } else if (numLog[i + 1] - numLog[i] == s) {
                answer.append("s");
            } else if (numLog[i + 1] - numLog[i] == d) {
                answer.append("d");
            } else if (numLog[i + 1] - numLog[i] == a) {
                answer.append("a");
            }
        }

        return answer.toString();
    }
}
