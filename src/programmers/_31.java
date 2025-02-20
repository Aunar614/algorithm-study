package programmers;

public class _31 {

    public static void main(String[] args) {
        String my_String = "BCBdbe";
        String letter = "B";
    }

    public String solution(String my_String, String letter) {
        StringBuilder myString = new StringBuilder(my_String);
        int index = myString.indexOf(letter);

        while (true) {
            if (index != -1) {
                myString.deleteCharAt(index);
                index = myString.indexOf(letter);
            } else {
                break;
            }
        }
        return myString.toString();
    }
}
