package programmers;

public class _5 {

    public static void main(String[] args) {

        String my_string = "string";
        int k = 3;


    }

    public String solution(String my_string, int k) {
        String[] answers = new String[k];
        for (int i = 0; i < k; i++) {
            answers[i] = my_string;
        }

        return String.join("", answers);
    }
}
