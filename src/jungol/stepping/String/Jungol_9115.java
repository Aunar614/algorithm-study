package jungol.stepping.String;

import java.util.Scanner;

public class Jungol_9115 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] strings = str.split("");
        char[] ch = new char[strings.length];

        for (int i = 0; i < strings.length; i++) {
            ch[i] = strings[i].charAt(0);

            int num = (int) ch[i];
            if (num > 64 && num < 91) {
                num += 32;
            } else if (num > 96 && num < 123) {
                num -= 32;
            }
            ch[i] = (char) num;
        }

        System.out.println(ch);
    }
}
