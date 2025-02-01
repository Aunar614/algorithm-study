package baekjoon;

import java.util.Scanner;

public class BaekJoon_2562 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[9];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int maxNum = nums[0];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= maxNum) {
                maxNum = nums[i];
                count = i+1;
            } else {
                continue;
            }
        }

        System.out.println(maxNum);
        System.out.println(count);
    }
}

