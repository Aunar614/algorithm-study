package baekjoon;

import java.util.Scanner;

public class BaekJoon_27866 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int num = sc.nextInt();
        String[] names = name.split("");
        String answer = names[num - 1];

        System.out.println(answer);
    }
}
