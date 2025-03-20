package jungol.stepping.function;

import java.util.Scanner;

public class Jungol_9096 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("원의 반지름 : ");
        int radius = sc.nextInt();

        System.out.println("원의 넓이");
        double square = radius * radius * 3.14;
        int floor = (int) Math.floor(square);
        long round = Math.round(square);
        int ceil = (int) Math.ceil(square);
        System.out.println("버림 : " + floor);
        System.out.println("반올림 : " + round);
        System.out.println("올림 : " + ceil);
    }
}
