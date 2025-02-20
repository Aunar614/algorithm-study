package programmers;

public class _27 {

    public static void main(String[] args) {
        String my_string = "jaron";
    }

    public String solution(String my_string) {
        String[] strings = my_string.split("");
        StringBuilder temp = new StringBuilder();

        for (int i = strings.length - 1; i >= 0; i--) {
            temp.append(strings[i]);
        }

        return temp.toString();
    }
}
