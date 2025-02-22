package programmers;

public class _40 {

    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int c = 1;
    }

    public int solution(int a, int b, int c) {
        int answer = 0;

        if (a == b && a == c) {
            answer = (a + b + c) * ((a * a * a) + (b * b * b) + (c * c * c)) * ((a * a) + (b * b) + (c * c));
        } else if (a == b || a == c || b == c) {
            answer = ((a * a) + (b * b) + (c * c)) * (a + b + c);
        } else {
            answer = a + b + c;
        }

        return answer;
    }
}
