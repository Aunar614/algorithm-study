package programmers;

public class _35 {

    public static void main(String[] args) {
        int age = 100;
    }

    public String solution(int age) {
        String ageString = String.valueOf(age);
        String[] strings = ageString.split("");
        int max = strings.length;

        return checkAscii(strings, max);
    }

    private static String checkAscii(String[] strings, int max) {
        StringBuilder temp = new StringBuilder();

        // 아스키코드 a = 97
        // 아스키코드를 활용하여 알파벳 추출
        // 추출한 알파벳은 StringBuilder 를 통하여 append
        for (int i = 0; i < max; i++) {
            Integer num = Integer.valueOf(strings[i]);
            temp.append((char) (num + 97));
        }

        return temp.toString();
    }
}
