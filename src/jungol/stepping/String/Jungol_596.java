package jungol.stepping.String;

import java.util.Scanner;

public class Jungol_596 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int endStr = sc.nextInt();
        String reversed = new StringBuilder(str).reverse().toString();

        if (endStr > reversed.length()) {
            endStr = reversed.length();
        }

        String subString = reversed.substring(0, endStr);
        System.out.println(subString);

    }
}
