package programmers;

import java.util.Arrays;

public class _14 {

    public static void main(String[] args) {
        int[] array = {1, 1, 1, 2, 3, 4, 4};

    }

    class Solution {
        public int solution(int[] array) {
            // Arrays.stream.distinct() 를 활용해 중복을 제거
            int[] newArray = Arrays.stream(array).distinct().toArray();
            int answer = 0;
            int count = 0;

            // 중복을 제거한 배열을 주어진 배열과 비교하여 최빈값 구하기
            for (int i = 0; i < newArray.length; i++) {
                int temp = 0;
                for (int j = 0; j < array.length; j++) {
                    if (newArray[i] == array[j]) {
                        temp++;
                    }
                }
                if (temp == count) {
                    answer = -1;
                } else if (temp > count) {
                    count = temp;
                    answer = newArray[i];
                }
            }

            return answer;
        }
    }
}
