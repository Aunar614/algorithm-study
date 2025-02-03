package baekjoon;

import java.util.Scanner;

public class BaekJoon_9086 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        /* 백준에서 NoSuchElementException 발생
        for (int i = 0; i <= num; i++) {
            String[] names = sc.next().split("");
            int lastNum = names.length - 1;

            System.out.println(names[0] + names[lastNum]);

        }
        */

        // 재풀이
        int i = 0;
        while (i != num) {

            String[] names = sc.next().split("");
            int lastNum = names.length - 1;

            System.out.println(names[0] + names[lastNum]);
            i++;
        }
    }
}
