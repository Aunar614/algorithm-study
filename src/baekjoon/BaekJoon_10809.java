package baekjoon;

import java.util.Scanner;

public class BaekJoon_10809 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int[] answer = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,};
        String[] alphabets = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        String[] names = sc.nextLine().split("");

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < alphabets.length; j++) {
                if (names[i].equals(alphabets[j])) {
                    if (answer[j] == -1) {
                        answer[j] = i;
                    }
                }
            }
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]);
            if (i < answer.length - 1) {
                System.out.print(" ");
            }
        }

    }
}
