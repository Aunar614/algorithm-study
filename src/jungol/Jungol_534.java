package jungol;

import java.io.*;

public class Jungol_534 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String score = br.readLine();

        // switch 문 작성
        switch (score) {
            case "A":
                bw.write("Excellent");
                break;
            case "B":
                bw.write("Good");
                break;
            case "C":
                bw.write("Usually");
                break;
            case "D":
                bw.write("Effort");
                break;
            case "F":
                bw.write("Failure");
                break;
            default:
                bw.write("error");
                break;
        }

        // 개선된 switch 문 작성
        /*switch (num) {
            case 1 -> bw.write("Excellent");
            case 2 -> bw.write("Good");
            case 3 -> bw.write("Usually");
            case 4 -> bw.write("Effort");
            case 5 -> bw.write("Failure");
            default -> bw.write("error")
        }*/

        br.close();
        bw.close();
    }
}
