package programmers;

public class _23 {
    public static void main(String[] args) {
        String ineq = ">";
        String eq = "!";
        int n = 41;
        int m = 78;

    }

    public int solution(String ineq, String eq, int n, int m) {

        if (ineq.equals("<")) {
            if (eq.equals("=")) {
                return n <= m ? 1 : 0;
            } else if (eq.equals("!")) {
                return n < m ? 1 : 0;
            }
        } else if (ineq.equals(">")) {
            if (eq.equals("=")) {
                return n >= m ? 1 : 0;
            } else if (eq.equals("!")) {
                return n > m ? 1 : 0;
            }
        }
        return 0;
    }
}
