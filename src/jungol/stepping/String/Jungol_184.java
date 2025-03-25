package jungol.stepping.String;

import java.util.Scanner;

public class Jungol_184 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toLowerCase();
        String[] strings = str.split("");

        char[] ch = new char[str.length()];
        String answer = "";
        for (int i = 0; i < ch.length; i++) {
            ch[i] = strings[i].charAt(0);

            int num = (int) ch[i];
            if ((num > 47 && num < 58) || (num > 96 && num < 123)) {
                answer += String.valueOf(ch[i]);
            }
        }

        System.out.println(answer);
    }
}
