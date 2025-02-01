package baekjoon;

import java.util.Scanner;

public class BaekJoon_10807 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalNum = sc.nextInt();
        int[] nums = new int[totalNum];
        int answerNum = 0;

        for (int i = 0; i < totalNum; i++) {
            nums[i] = sc.nextInt();
        }

        int checkNum = sc.nextInt();

        for (int i = 0; i < totalNum; i++) {
            if (checkNum == nums[i]) {
                answerNum++;
            }
        }

        System.out.println(answerNum);
    }
}
