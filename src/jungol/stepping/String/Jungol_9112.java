package jungol.stepping.String;

import java.util.Scanner;

public class Jungol_9112 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println("입력받은 문자열의 길이는 " + str.length() + "입니다.");
        System.out.println(reversed);
    }
}
