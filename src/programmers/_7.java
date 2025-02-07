package programmers;

public class _7 {

    public static void main(String[] args) {
        int a = 2;
        int b = 91;
    }

    public int solution(int a, int b) {
        // int -> String
        String num1 = String.valueOf(a);
        String num2 = String.valueOf(b);

        // String 합체
        String checkNum1 = num1 + num2;

        // 합체 된 String -> int
        int compareNum1 = Integer.parseInt(checkNum1);

        // 2 * num1 * num2 값
        int compareNum2 = 2 * a * b;

        // 두 수의 값 비교
        return Math.max(compareNum1, compareNum2);

    }
}
