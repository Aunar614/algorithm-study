package programmers;

public class _6 {

    public static void main(String[] args) {
        int a = 9;
        int b = 91;

    }

    public int solution(int a, int b) {
        // int -> String
        String num1 = String.valueOf(a);
        String num2 = String.valueOf(b);

        // String 합체
        String checkNum1 = num1 + num2;
        String checkNum2 = num2 + num1;

        // 합체 된 String -> int
        int compareNum1 = Integer.parseInt(checkNum1);
        int compareNum2 = Integer.parseInt(checkNum2);

        // 두 수의 크기 비교
        int answer = 0;

        if (compareNum1 > compareNum2) {
            return compareNum1;
        } else if (compareNum2 > compareNum1) {
            return compareNum2;
        } else {
            return compareNum1;
        }

    }
}
