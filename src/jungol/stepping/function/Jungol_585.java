package jungol.stepping.function;

import java.util.Scanner;

public class Jungol_585 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        int bubble;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    bubble = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = bubble;
                }
            }
            for (int j = 0; j < 10; j++) {
                if (i < 9) {
                    System.out.print(arr[j] + " ");
                }
            }
            System.out.println();
        }
    }
}
