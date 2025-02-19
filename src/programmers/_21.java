package programmers;

import java.util.Arrays;

public class _21 {

    public static void main(String[] args) {
        int money = 15000;

    }

    public int[] solution(int money){
        int price = 5500;
        int[] answer = new int[2];

        answer[0] = money / price;
        answer[1] = money % price;

        return answer;
    }
}
