package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Jungol_9076 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int prevPreve = 1;
        int prev = 1;
        int answer = 0;

        int answer10 = 0, answer20 = 0, answer30 = 0, answer40 = 0;
        for (int i = 1; i < 39; i++) {
            answer = prev + prevPreve;
            prevPreve = prev;
            prev = answer;
            if (i == 8) {
                answer10 = answer;
            } else if (i == 18) {
                answer20 = answer;
            } else if (i == 28) {
                answer30 = answer;
            } else if (i == 38) {
                answer40 = answer;
            }
        }

        bw.write("피보나치 수열 10항 : " + answer10 + "\n");
        bw.write("피보나치 수열 20항 : " + answer20 + "\n");
        bw.write("피보나치 수열 30항 : " + answer30 + "\n");
        bw.write("피보나치 수열 40항 : " + answer40);

        sc.close();
        bw.close();
    }
}