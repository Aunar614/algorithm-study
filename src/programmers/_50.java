package programmers;

import java.util.ArrayList;
import java.util.List;

public class _50 {

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};

        // stk 빈 배열이면 arr[i]를 atk에 추가하고 i++
        // stk 원소가 있고, stk 의 마지막 원소가 arr[i] 보다 작으면 arr[i] 를 stk 의 뒤에 추가, i++
        // stk 원소가 있고, stk 의 마지막 원소가 arr[i] 보다 크거나 같으면 stk 의 마지막 원소 제거
    }

    public int[] solution(int[] arr) {
        List<Integer> stkTemp = new ArrayList<>();
        int i = 0;
        while (i != arr.length) {
            if (stkTemp.isEmpty()) {
                stkTemp.add(arr[i]);
                i++;
            } else if (stkTemp.getLast() < arr[i]) {
                stkTemp.add(arr[i]);
                i++;
            } else if (stkTemp.getLast() >= arr[i]) {
                stkTemp.removeLast();
            }
        }

        int[] stk = new int[stkTemp.size()];
        for (int j = 0; j < stkTemp.size(); j++) {
            stk[j] = stkTemp.get(j);
        }
        return stk;
    }
}
