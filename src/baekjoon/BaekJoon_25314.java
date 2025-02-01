package baekjoon;

import java.util.Scanner;

public class BaekJoon_25314 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt() / 4;
        String longString = "";

        for (int i = 0; i < num; i++) {
            longString += "long ";
        }

        System.out.println(longString + "int");
    }
}

