package programmers;

public class _19 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    }

    public double solution(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.length;
    }
}
