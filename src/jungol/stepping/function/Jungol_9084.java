package jungol.stepping.function;

import java.util.Scanner;

public class Jungol_9084 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printStar(n);
    }

    private static void printStar(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("*");
            System.out.println(sb);
        }
    }
}
