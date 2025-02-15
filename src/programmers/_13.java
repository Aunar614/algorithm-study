package programmers;

import java.util.Arrays;

public class _13 {

    public static void main(String[] args) {
        int[] array = {9, -1, 0};

    }

    class Solution {
        public int solution(int[] array) {
            Arrays.sort(array);
            return array[array.length / 2];
        }
    }
}
