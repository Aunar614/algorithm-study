package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class BaekJoon_1427 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] strings = str.split("");
        Integer[] numbers = new Integer[strings.length];
        br.close();

        for (int i = 0; i < strings.length; i++) {
            numbers[i] = Integer.valueOf(strings[i]);
        }

        Arrays.sort(numbers, Collections.reverseOrder());
        for (Integer number : numbers) {
            bw.write(number + "");
        }
        bw.close();

    }
}
