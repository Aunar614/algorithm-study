package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_3052 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] totalNum = new int[10];

        for (int i = 0; i < 10; i++) {
            totalNum[i] = sc.nextInt() % 42;
        }

        // 배열 속 중복제거
        totalNum = Arrays.stream(totalNum).distinct().toArray();

        System.out.println(totalNum.length);
    }
}
