package programmers;

import java.util.Arrays;

public class _46 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3}, {1, 2}, {1, 4}};
    }

    public int[] solution(int[] arr, int[][] queries) {
        int temp1 = 0;
        int temp2 = 0;

        for (int[] query : queries) {
            int index1 = query[0];
            int index2 = query[1];

            temp1 = arr[index1];
            temp2 = arr[index2];

            arr[index1] = temp2;
            arr[index2] = temp1;
        }

        return arr;
    }
}
