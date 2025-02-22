package programmers;

public class _37 {

    public static void main(String[] args) {
        int n = 100;
    }

    public int solution(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        return count;
    }
}
