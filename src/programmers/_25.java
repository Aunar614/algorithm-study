package programmers;

public class _25 {

    public static void main(String[] args) {
        int storage = 1000;
        int usage = 2000;
        int[] change = {10, 25, -33};
    }

//    물부족 문제
/*    public int solution(int storage, int usage, int[] change) {
        int total_usage = 0;
        for(int i=0; i<change.length; i++){
            usage = total_usage * change[i] / 100;
            total_usage += usage;
            if(total_usage > storage){
                return i;
            }
        }
        return -1;
    }*/

    // 내 풀이
    // for 문 usage 정의 부분 변경
    public int solution(int storage, int usage, int[] change) {
        int total_usage = usage;
        for(int i = 0; i < change.length; i++){
            usage = usage + (usage * change[i] / 100);
            total_usage += usage;
            if(total_usage > storage){
                return i;
            }
        }
        return -1;
    }
}
