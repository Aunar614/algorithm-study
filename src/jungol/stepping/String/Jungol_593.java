package jungol.stepping.String;

import java.util.Scanner;

public class Jungol_593 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("ASCII code =? ");
            int num = sc.nextInt();
            if (num < 33 || num > 127) {
                break;
            }

            System.out.println((char) num);
        }
    }
}
