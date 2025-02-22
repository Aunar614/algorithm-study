package programmers;

public class _38 {

    public static void main(String[] args) {
        int hp = 999;
    }

    // 내 풀이 1
    public int solution(int hp) {
        int general = 5;
        int soldier = 3;
        int worker = 1;
        int answer = 0;

        while (true) {
            if (hp == 0) {
                break;
            } else if (hp >= general) {
                answer += hp / general;
                hp -= (hp / general) * general;
            } else if (hp >= soldier) {
                answer += hp / soldier;
                hp -= (hp / soldier) * soldier;
            } else if (hp >= worker) {
                answer += hp / worker;
                hp -= (hp / worker) * worker;
            }
        }

        return answer;
    }

    // 복잡성 해결한 풀이 2
    public int solution2(int hp) {
        int answer = 0;

        answer += (hp / 5);
        hp %= 5;

        answer += (hp / 3);
        hp %= 3;

        answer += (hp / 1);
        hp %= 1;

        return answer;
    }
}
