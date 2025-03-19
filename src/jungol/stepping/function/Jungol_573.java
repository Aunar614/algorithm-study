package jungol.stepping.function;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Jungol_573 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printSquare(n);
    }

    private static void printSquare(int n) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i = 1;
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                bw.write(i + "");
                if (k < n - 1) {
                    bw.write(" ");
                }
                i++;
            }
            if (j < n - 1) {
                bw.write("\n");
            }
        }

        bw.close();
    }

}
