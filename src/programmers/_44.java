package programmers;

import java.util.Arrays;

public class _44 {

    public static void main(String[] args) {
        int n = 0;
        String control = "wsdawsdassw";
    }

    public int solution(int n, String control) {
        String[] controls = control.split("");

        for (String word : controls) {
            switch (word) {
                case "w" -> n += 1;
                case "s" -> n -= 1;
                case "d" -> n += 10;
                case "a" -> n -= 10;
            }
        }

        return n;
    }
}
