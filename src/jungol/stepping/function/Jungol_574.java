package jungol.stepping.function;

import java.util.Scanner;

public class Jungol_574 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();

        int max = resultMax(n, m, x);

        System.out.println(max);
    }

    private static int resultMax(int n, int m, int x) {
        int max = 0;
        if (n > m) {
            max = n;
        } else {
            max = m;
        }
        if (max > x) {
            return max;
        } else {
            return x;
        }
    }
}
