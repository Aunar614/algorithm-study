package programmers;

import java.util.Arrays;

public class _29 {

    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        int even = 0;
        int odd = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        int[] answer = {even, odd};
        System.out.println(Arrays.toString(answer));
    }

    public int[] solution(int[] num_list) {
        int even = 0;
        int odd = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        return new int[]{even, odd};
    }
}
