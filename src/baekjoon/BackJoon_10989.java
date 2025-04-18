package baekjoon;

import java.io.*;
import java.util.Arrays;

public class BackJoon_10989 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        Arrays.sort(numbers);
        for (int number : numbers) {
            bw.write(number + "\n");
        }

        bw.close();
    }
}
