package jungol.stepping.loop;

import java.io.*;

public class Jungol_9045 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            bw.write("1. 입력하기\n");
            bw.write("2. 출력하기\n");
            bw.write("3. 삭제하기\n");
            bw.write("4. 끝내기\n");
            bw.write("작업할 번호를 선택하세요. ");
            bw.flush();

            int num = Integer.parseInt(br.readLine());
            bw.write("\n");

            switch (num) {
                case 1 -> bw.write("입력하기를 선택하였습니다.\n\n");
                case 2 -> bw.write("출력하기를 선택하였습니다.\n\n");
                case 3 -> bw.write("삭제하기를 선택하였습니다.\n\n");
                case 4 -> bw.write("끝내기를 선택하였습니다.");
                default -> bw.write("잘못 입력하였습니다. \n\n");
            }
            bw.flush();

            if (num == 4) break;
        }

        bw.close();
    }
}
