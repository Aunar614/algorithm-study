package programmers;

public class _11 {

    public static void main(String[] args) {
        int n = 10;

    }

    public int solution(int n) {
        int sum = 0;

        if (n % 2 == 0) {
            for (int i = 2; i <= n; i += 2) {
                sum += i * i;
            }
            return sum;
        }
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;

    }
}
