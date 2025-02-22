package programmers;

public class _41 {

    public static void main(String[] args) {
        int[] num_list = {5, 7, 8, 3};
    }

    public int solution(int[] num_list) {
        int square = checkSumSquare(num_list);
        int multiple = checkMultiple(num_list);

        return multiple < square ? 1 : 0;
    }

    public static int checkMultiple(int[] numList) {
        int multiple = 1;

        for (int i : numList) {
            multiple *= i;
        }

        return multiple;
    }

    public static int checkSumSquare(int[] numList) {
        int sum = 0;

        for (int i : numList) {
            sum += i;
        }

        return sum * sum;
    }
}
