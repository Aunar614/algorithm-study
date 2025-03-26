package jungol.stepping.String;

import java.util.Scanner;

public class Jungol_185 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String findStr = sc.next();

        int index = str.indexOf(findStr);
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("No");
        }
    }
}
