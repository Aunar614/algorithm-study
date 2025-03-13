package jungol.stepping.array;

import java.io.*;
import java.util.*;

public class Jungol_559 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        odd.sort(Comparator.naturalOrder());
        even.sort(Comparator.naturalOrder());

        bw.write(odd.getFirst() + " " + even.getLast());

        sc.close();
        bw.close();
    }
}