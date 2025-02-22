package programmers;

public class _42 {

    public static void main(String[] args) {
        int[] num_list = {5, 7, 8, 3};
    }

    public int solution(int[] num_list) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        for (int i : num_list) {
            if (i % 2 == 0) {
                even.append(i);
            } else {
                odd.append(i);
            }
        }

        return Integer.parseInt(odd.toString()) + Integer.parseInt(even.toString());
    }
}
