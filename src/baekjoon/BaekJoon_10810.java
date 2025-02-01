package baekjoon;

import java.util.Scanner;

public class BaekJoon_10810 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n = 바구니 개수;
        // m  = 공을 넣는 횟수;
        // i부터 j번까지 바구니에 k 숫자가 적힌 공을 넣는다
        // 바구니에는 공이 1개만 들어갈 수 있다
        // 바구니에 들어있는 공의 번호를 출력하라

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] baskets = new int[n];

        for (int i = 0; i < m; i++) {
            int start = sc.nextInt() - 1;
            int end = sc.nextInt() - 1;
            int num = sc.nextInt();

            for (int j = start; j <= end; j++) {
                baskets[j] = num;
            }

        }

        for (int i = 0; i < baskets.length; i++) {
            System.out.print(baskets[i]);
            if (i < baskets.length - 1) {
                System.out.print(" ");
            }
        }

    }
}

