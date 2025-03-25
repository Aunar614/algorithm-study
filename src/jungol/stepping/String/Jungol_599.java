package jungol.stepping.String;

import java.util.Scanner;

public class Jungol_599 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] strings = str.split("");
        char[] ch = new char[strings.length];

        for (int i = 0; i < strings.length; i++) {
            ch[i] = strings[i].charAt(0);
        }

        String answer = "";
        for (int i = 0; i < ch.length; i++) {
            int num = (int) ch[i];
            if (num > 64 && num < 91) {
                answer += (char) num;
            } else if (num > 96 && num < 123) {
                answer += (char) num;
            }
        }

        System.out.println(answer.toUpperCase());
    }
}
