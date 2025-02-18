package programmers;

public class _18 {

    public static void main(String[] args) {
        int slice = 4;
        int n = 12;

    }

    public int solution(int slice, int n) {
        int answer = 1;
        int temp = 0;

        while (true) {
            temp = slice * answer;
            if (temp >= n) {
                break;
            }
            answer++;
        }
        return answer;
    }
}
