package programmers;

public class _16 {

    public static void main(String[] args) {
        int pizza = 7;
        int n = 15;
        int answer = 0;

        if ((n % pizza) == 0) {
            answer = n / pizza;
        } else if (n % pizza != 0) {
            answer = n / pizza + 1;
        }

        System.out.println(answer);
    }

    public int solution(int n) {
        int pizza = 7;
        int answer = 0;

        if ((n % pizza) == 0) {
            answer = n / pizza;
        } else if (n % pizza != 0) {
            answer = n / pizza + 1;
        }

        return answer;
    }
}
