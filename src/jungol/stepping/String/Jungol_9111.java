package jungol.stepping.String;

import java.util.Scanner;

public class Jungol_9111 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        String str = "jungol olympiad";
        char[] charArr = new char[5];
        for (int i = 0; i < 5; i++) {
            charArr[i] = str.charAt(numbers[i]);
        }

        System.out.println(charArr);
    }
}
