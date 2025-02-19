package programmers;

import java.util.Arrays;

public class _24 {

    public static void main(String[] args) {
        String code = "";

    }

    public String solution(String code) {
        String[] arr = code.split("");
        String answer = "";
        int mode = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("1")) {
                if (mode == 0) {
                    mode = 1;
                } else {
                    mode = 0;
                }
            } else if (mode == 0 && i % 2 == 0) {
                answer += arr[i];
            } else if (mode == 1 && i % 2 != 0) {
                answer += arr[i];
            }
        }

        if (answer.equals("")) {
            return "EMPTY";
        }

        return answer;
    }
}
