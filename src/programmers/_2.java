package programmers;

import java.util.Scanner;

public class _2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = "Program29b8UYP";
        int s = 7;
        String overwrite_string = "merS123";

        String answer = solution(my_string, overwrite_string, s);
        System.out.println(answer);

    }

    /* 테스트 케이스 1개 통과 못함
    public static String solution(String my_string, String overwrite_string, int s) {
        String temp = my_string.substring(s, (overwrite_string.length() + s));
        System.out.println(temp);
        return my_string.replace(temp, overwrite_string);
    }
    */

    // StringBuilder로 해결
    public static String solution(String my_string, String overwrite_string, int s) {
            return new StringBuilder(my_string).replace(s, overwrite_string.length() + s, overwrite_string).toString();
    }



}
