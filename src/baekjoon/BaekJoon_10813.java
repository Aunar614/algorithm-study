package baekjoon;

import java.util.Scanner;

public class BaekJoon_10813 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = 1;

        int[] baskets = new int[n];

        for (int i = 0; i < baskets.length; i++) {
            baskets[i] = a;
            a++;
        }

        for (int i = 0; i < m; i++) {
            int firstNum = sc.nextInt() - 1;
            int endNum = sc.nextInt() - 1;
            int changeNum = baskets[firstNum];
            baskets[firstNum] = baskets[endNum];
            baskets[endNum] = changeNum;
        }

        for (int i = 0; i < baskets.length; i++) {
            System.out.print(baskets[i]);
            if (i < baskets.length - 1) {
                System.out.print(" ");
            }
        }


    }
}

