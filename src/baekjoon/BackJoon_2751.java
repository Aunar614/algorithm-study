package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class BackJoon_2751 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numbers.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(numbers);
        for (Integer number : numbers) {
            bw.write(number + "\n");
        }
        bw.close();
    }
}
