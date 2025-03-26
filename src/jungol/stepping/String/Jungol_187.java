package jungol.stepping.String;

import java.util.Scanner;

public class Jungol_187 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (sb.length() == 1) {
                break;
            }
            int index = sc.nextInt();
            if (sb.length() < index) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.deleteCharAt(index - 1);
            }
            System.out.println(sb);
        }
    }
}
