package jungol;

import java.io.*;
import java.util.Scanner;

public class Jungol_133 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);

        int count = Integer.parseInt(br.readLine());
        String num = br.readLine();
        String[] number = num.split(" ");

        int[] numbers = new int[count];
        for (int i = 0; i < number.length; i++) {
            numbers[i] = Integer.parseInt(number[i]);
        }

        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        double avg = (double) sum / count;

        bw.write(String.format("%.2f", avg));


        /*int count = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += sc.nextInt();
        }
        double avg = (double) sum / count;

        System.out.printf("%.2f", avg);*/

        bw.close();
    }
}
