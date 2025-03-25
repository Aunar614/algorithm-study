package jungol.stepping.String;

import java.util.Scanner;

public class Jungol_9108 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            char ch = sc.nextLine().charAt(0);
            System.out.println(ch + " -> " + (int) ch);

            if (ch == '0') {
                break;
            }
        }
    }
}
