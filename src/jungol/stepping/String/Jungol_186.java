package jungol.stepping.String;

import java.util.Scanner;

public class Jungol_186 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(str1.length() > str2.length() ? str1.length() : str2.length());
    }
}
