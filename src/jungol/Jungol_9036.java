package jungol;

import java.io.*;

public class Jungol_9036 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("1. 삽입\n");
        bw.write("2. 수정\n");
        bw.write("3. 삭제\n");
        bw.write("숫자를 선택하세요. ");
        bw.flush();

        int num = Integer.parseInt(br.readLine());

        // switch 문 작성
        switch (num) {
            case 1:
                bw.write("삽입을 선택하셨습니다.");
                break;
            case 2:
                bw.write("수정을 선택하셨습니다.");
                break;
            case 3:
                bw.write("삭제을 선택하셨습니다.");
                break;
            default:
                bw.write("숫자를 잘못 입력하셨습니다.");
                break;
        }

        // 개선된 switch 문 작성
        /*switch (num) {
            case 1 -> bw.write("삽입을 선택하셨습니다.");
            case 2 -> bw.write("수정을 선택하셨습니다.");
            case 3 -> bw.write("삭제을 선택하셨습니다.");
            default -> bw.write("숫자를 잘못 입력하셨습니다.");
        }*/

        br.close();
        bw.close();
    }
}
