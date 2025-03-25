package jungol.stepping.String;

import java.util.Scanner;

public class Jungol_9114 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            char ch = sc.nextLine().charAt(0);
            int num = (int) ch;

            if (num > 47 && num < 58) {
                System.out.println("숫자문자입니다.");
            } else if (num > 64 && num < 91) {
                System.out.println("대문자입니다.");
            } else if (num > 96 && num < 123) {
                System.out.println("소문자입니다.");
            } else {
                System.out.println("영문, 숫자 이외의 문자입니다.");
                break;
            }
        }
    }
}
