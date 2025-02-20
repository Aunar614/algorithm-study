package programmers;

public class _32 {

    public static void main(String[] args) {
        int angle = 90;
    }
    public int solution(int angle) {
        // 0 < angle < 90 -> 1
        // angle = 90 -> 2
        // 90 < angle < 180 -> 3
        // angle = 180 -> 4

        if (angle < 90) {
            return 1;
        } else if (angle == 90) {
            return 2;
        } else if (angle < 180) {
            return 3;
        } else if (angle == 180) {
            return 4;
        }
        return -1;
    }
}
