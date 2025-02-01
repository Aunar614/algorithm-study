package baekjoon;

import java.util.Scanner;

public class BaekJoon_10811 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] baskets = new int[n];

        for (int i = 0; i < baskets.length; i++) {
            baskets[i] += i + 1;
        }

        for (int i = 0; i < m; i++) {
            int num1 = sc.nextInt() - 1;
            int num2 = sc.nextInt() - 1;

            // num2부터 num1까지 역순
            for (int j = num1; j <= num2; j++) {
                int changeNum = num2--;

                int temp = baskets[j];
                baskets[j] = baskets[changeNum];
                baskets[changeNum] = temp;
            }
        }

        for (int i = 0; i < baskets.length; i++) {
            System.out.print(baskets[i]);
            if (i <= baskets.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
