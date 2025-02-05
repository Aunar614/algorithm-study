package baekjoon;

import java.util.Scanner;

public class BaekJoon_3003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] pieces = {1, 1, 2, 2, 2, 8};

        int[] checkPieces = new int[6];

        for (int i = 0; i < checkPieces.length; i++) {
            checkPieces[i] = pieces[i] - sc.nextInt();

            System.out.print(checkPieces[i]);
            if (i < checkPieces.length - 1) {
                System.out.print(" ");
            }
        }

    }
}
