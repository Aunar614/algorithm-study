package programmers;

public class _30 {

    public static void main(String[] args) {
        String my_string = "hello";
        int n = 3;
    }

    public String solution(String my_string, int n) {
        String[] myString = my_string.split("");
        StringBuilder myStr = new StringBuilder();

        for (String str : myString) {
            for (int j = 0; j < n; j++) {
                myStr.append(str);
            }
        }

        return myStr.toString();
    }
}
