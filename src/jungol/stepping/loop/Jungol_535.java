package jungol.stepping.loop;

import java.io.*;

public class Jungol_535 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double score = Double.parseDouble(br.readLine());

        // switch 문 작성
        switch ((int) score) {
            case 4:
                bw.write("scholarship");
                break;
            case 3:
                bw.write("next semester");
                break;
            case 2:
                bw.write("seasonal semester");
                break;
            case 1:
                bw.write("retake");
                break;
            default:
                bw.write("error");
                break;
        }

        // 개선된 switch 문 작성
        /*switch ((int) score) {
            case 4 -> bw.write("scholarship");
            case 3 -> bw.write("next semester");
            case 2 -> bw.write("seasonal semester");
            case 1 -> bw.write("retake");
            default -> bw.write("error")
        }*/

        br.close();
        bw.close();
    }
}
