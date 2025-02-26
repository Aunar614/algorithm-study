package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class BackJoon_25305 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int cutLine = sc.nextInt();
        int[] scores = new int[count];

        for (int i = 0; i < count; i++) {
            int score = sc.nextInt();
            scores[i] = score;
        }

        Arrays.sort(scores);
        System.out.println(scores[scores.length - cutLine]);
    }
}
