package baekjoon;

import java.util.Scanner;

public class BaekJoon_10818 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalNum = sc.nextInt();
        int[] nums = new int[totalNum];

        for (int i = 0; i < totalNum; i++) {
            nums[i] = sc.nextInt();
        }

        int minNum = nums[0];
        int maxNum = nums[0];

        for (int i = 0; i < totalNum; i++) {
            if (nums[i] <= minNum) {
                minNum = nums[i];
            } else if (nums[i] >= maxNum) {
                maxNum = nums[i];
            }
        }

        System.out.println(minNum + " " + maxNum);
    }
}

