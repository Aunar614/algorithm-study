package baekjoon;

import java.io.*;

public class BaekJoon_1264 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String str = br.readLine().toLowerCase();
            if (str.equals("#")) {
                break;
            }
            String[] words = str.split("");
            String[] compare = {"a", "e", "i", "o", "u"};
            int count = 0;
            for (int i = 0; i < words.length; i++) {
                for (int j = 0; j < compare.length; j++) {
                    if (words[i].equals(compare[j])) {
                        count++;
                    }
                }
            }
            bw.write(count + "\n");
        }
        br.close();
        bw.close();
    }
}
