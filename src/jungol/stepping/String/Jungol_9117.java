package jungol.stepping.String;

import java.util.Scanner;

public class Jungol_9117 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String original = sc.nextLine();
        String changeStr = original;

        while (true) {
            String subString1 = changeStr.substring(0, 1);
            String subString2 = changeStr.substring(1);

            String answer = subString2 + subString1;
            System.out.println(answer);
            if (answer.equals(original)) {
                break;
            }
            changeStr = answer;
        }
    }
}
