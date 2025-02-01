package baekjoon;

import java.util.Scanner;

public class BaekJoon_5597 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] students = new int[30];
        int student = 1;
        int num1 = students[0];
        int num2 = students[0];
        int checkNum = 0;

        for (int i = 0; i < students.length; i++) {
            students[i] = student;
            student++;
        }

        for (int i = 0; i < 28; i++) {
            int num = sc.nextInt() - 1;
            students[num] = 0;
        }

        for (int i = 0; i < students.length; i++) {
            checkNum = students[i];
            if (checkNum > num1) {
                num1 = checkNum;
                break;
            }
        }

        for (int i = 0; i < students.length; i++) {
            checkNum = students[i];
            if (num1 < checkNum) {
                num2 = checkNum;
                break;
            }
        }

        System.out.println(num1);
        System.out.println(num2);


    }
}

