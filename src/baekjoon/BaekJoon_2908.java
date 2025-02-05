package baekjoon;

import java.util.Scanner;

public class BaekJoon_2908 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arrayA = new int[3];
        int[] arrayB = new int[3];

        searchArray(a, arrayA);
        searchArray(b, arrayB);

        answer(arrayA, arrayB);

    }

    private static void answer(int[] arrayA, int[] arrayB) {
        if (arrayA[2] > arrayB[2]) {
            for (int i = 2; i >= 0; i--) {
                System.out.print(arrayA[i]);
            }
        } else if (arrayA[2] == arrayB[2]) {
            if (arrayA[1] > arrayB[1]) {
                for (int i = 2; i >= 0; i--) {
                    System.out.print(arrayA[i]);
                }
            } else if (arrayA[1] == arrayB[1]) {
                if (arrayA[0] > arrayB[0]) {
                    for (int i = 2; i >= 0; i--) {
                        System.out.print(arrayA[i]);
                    }
                } else {
                    for (int i = 2; i >= 0; i--) {
                        System.out.print(arrayB[i]);
                    }
                }
            } else {
                for (int i = 2; i >= 0; i--) {
                    System.out.print(arrayB[i]);
                }
            }
        } else {
            for (int i = 2; i >= 0; i--) {
                System.out.print(arrayB[i]);
            }
        }
    }

    private static void searchArray(int i, int[] j) {
        j[0] = i / 100;
        j[1] = (i - j[0] * 100) / 10;
        j[2] = (i % 10);
    }
}



