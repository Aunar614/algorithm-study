package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class Jungol_162 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numbers = new int[10];
        numbers[0] = sc.nextInt();
        numbers[1] = sc.nextInt();

        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = (numbers[i - 2] + numbers[i - 1]) % 10;
        }

        for (int i = 0; i < numbers.length; i++) {
            bw.write(numbers[i] + "");
            if (i < numbers.length - 1) {
                bw.write(" ");
            }
        }

        sc.close();
        bw.close();
    }
}