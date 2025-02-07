package programmers;

import java.util.stream.IntStream;

public class _8 {

    public static void main(String[] args) {
        int numer1 = 1;
        int denom1 = 24;
        int numer2 = 22;
        int denom2 = 48;

    }

    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        // 분수의 합 (두 분모의 곱으로 통분하여 계산)
        int num1 = (numer1 * denom2) + (numer2 * denom1);
        int num2 = denom1 * denom2;

        // IntStream.rangeClosed(a, b) -> a부터 b까지 수 추출
        // filter()를 통해서 두 수의 최대공약수 추출
        // Intstream의 경우 max()가 끝나고 반환되는 값의 타입이 'OptionalInt'
        // getAsInt()를 통해 정수로 반환
        int checkNum = IntStream.rangeClosed(1, Math.min(num1, num2)).filter(i -> num1 % i == 0 && num2 % i == 0).max().getAsInt();
        return new int[]{num1 / checkNum , num2 / checkNum};
    }

}
