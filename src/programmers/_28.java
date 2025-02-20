package programmers;

import java.util.Scanner;

public class _28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder print = new StringBuilder();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            print.append("*");
            System.out.println(print);
        }

    }
}
