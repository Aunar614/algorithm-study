package jungol.stepping.array;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jungol_558 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);

        // 풀이 방법 1
        String num = br.readLine();
        String[] number = num.split(" ");
        List<String> strings = new ArrayList<>();

        int count = number.length - 1;
        while (true) {
            if (count < 0) {
                break;
            }

            if (!number[count].equals("0")) {
                strings.add(number[count]);
            }
            count--;
        }

        for (int i = 0; i < strings.size(); i++) {
            bw.write(strings.get(i));
            if (i < strings.size() - 1) {
                bw.write(" ");
            }
        }

        // 풀이방법 2
        /*ArrayList<Integer> num = new ArrayList<>();
        ArrayList<Integer> number = new ArrayList<>();
        int count = 0;

        while (true) {
            int i = sc.nextInt();

            if (i == 0) {
                break;
            }
            num.add(i);
        }

        for (int i = num.size() - 1; i >= 0; i--) {
            number.add(num.get(i));
        }

        for (int i = 0; i < number.size(); i++) {
            System.out.print(number.get(i));
            if (i < number.size() - 1) {
                System.out.print(" ");
            }
        }*/

        br.close();
        bw.close();
    }
}