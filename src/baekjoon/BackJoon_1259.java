package baekjoon;

import java.io.*;

public class BackJoon_1259 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while (true){
            String n = br.readLine();

            if (n.equals("0")) {
                break;
            }

            String reverse = "";
            for (int i = n.length() - 1; i >= 0; i--) {
                reverse = reverse + n.charAt(i);
            }

            if (n.equals(reverse)) {
                bw.write("yes" + "\n");
            } else {
                bw.write("no" + "\n");
            }
        }
        br.close();
        bw.close();
    }
}
