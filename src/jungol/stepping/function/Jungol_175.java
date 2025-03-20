package jungol.stepping.function;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Jungol_175 {

    public static void main(String[] args) {
        Integer[] intArr = makeArr();
        descendArr(intArr);
    }

    private static void descendArr(Integer[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }
    }

    private static Integer[] makeArr() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        Integer[] arr = new Integer[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }
}
