package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Jungol_9078 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] number1 = new int[3][3];
        int[][] number2 = new int[3][3];

        // 배열 1 생성
        for (int i = 0; i < number1.length; i++) {
            bw.write("첫 번째 배열 " + (i + 1) + "행 ");
            bw.flush();
            for (int j = 0; j < number1[i].length; j++) {
                int n = sc.nextInt();
                number1[i][j] = n;
            }
        }
        // 배열 2 생성
        for (int i = 0; i < number2.length; i++) {
            bw.write("두 번째 배열 " + (i + 1) + "행 ");
            bw.flush();
            for (int j = 0; j < number2[i].length; j++) {
                int n = sc.nextInt();
                number2[i][j] = n;
            }
        }

        // 정답 배열 생성 및 배열 1과 배열 2의 합 출력
        int[][] answer = new int[3][3];
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                answer[i][j] = number1[i][j] + number2[i][j];
                bw.write(answer[i][j] + "");
                if (j < answer[i].length - 1) {
                    bw.write(" ");
                }
            }
            if (i < answer.length - 1) {
                bw.write("\n");
            }
        }

        sc.close();
        bw.close();
    }
}