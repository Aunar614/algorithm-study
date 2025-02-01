package baekjoon;

import java.util.Scanner;

public class BaekJoon_25304 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long totalPrice = sc.nextLong();
        int totalKind = sc.nextInt();
        int price;
        int quantity;
        int checkPrice = 0;

        for (long i = 0; i < totalKind; i++) {
            price = sc.nextInt();
            quantity = sc.nextInt();
            checkPrice += (price * quantity);
        }

        if (checkPrice == totalPrice) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
