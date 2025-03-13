package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.Scanner;

public class Jungol_155 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<String> jungol = List.of("J", "U", "N", "G", "O", "L");
        String str = sc.nextLine();

        int index = jungol.indexOf(str);
        if (index == -1) {
            bw.write("none");
        } else {
            bw.write(index + "");
        }

        sc.close();
        bw.close();
    }
}