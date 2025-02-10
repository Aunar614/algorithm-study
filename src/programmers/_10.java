package programmers;

public class _10 {

    public static void main(String[] args) {
        int number = 55;
        int n = 5;
        int m = 10;

    }

    public int solution(int number, int n, int m) {
        if ((number % n == 0) && (number % m == 0)) {
            return 1;
        }
        return 0;
    }
}
