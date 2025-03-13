package jungol.stepping.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class Jungol_561 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        // 100 이하의 수, 없으면 100 default
        ArrayList<Integer> downNum = new ArrayList<>();
        int down;
        for (int i : numbers) {
            if (i < 100) {
                downNum.add(i);
            }
        }
        if (downNum.isEmpty()) {
            down = 100;
        } else {
            down = downNum.getLast();
        }

        // 100 이상의 수, 없으면 100 default
        int up = 0;
        for (int i : numbers) {
            if (i > 100) {
                up = i;
                break;
            }
        }

        if (up == 0) {
            up = 100;
        }

        bw.write(down + " " + up);

        sc.close();
        bw.close();
    }
}