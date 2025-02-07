package programmers;

import java.util.Arrays;

public class _3 {

    public static void main(String[] args) {

        String str1 = "abab";
        String str2 = "zxzx";

        String s = solution(str1, str2);
        System.out.println(s);

    }

    public static String solution(String str1, String str2) {
        String[] str3 = str1.split("");
        String[] str4 = str2.split("");
        int length = str3.length + str4.length;

        String[] answer1 = new String[length];

        int x = 0;
        int y = 0;

        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                answer1[i] = str3[x];
                x++;
            } else {
                answer1[i] = str4[y];
                y++;
            }
        }
        return String.join("",answer1);
    }
}
