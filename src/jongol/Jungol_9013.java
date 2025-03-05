package jongol;

public class Jungol_9013 {

    public static void main(String[] args) {

        System.out.println("전체 7자리로 맞추고 소수 4자리까지 출력");

        double x = 1.2340;
        double y = 10.3459;

        System.out.printf("x = " + "%7.4f", x);
        System.out.println();
        System.out.printf("y = " + "%7.4f", y);
        System.out.println("\n");

        System.out.println("소수 2자리까지 출력(반올림)");
        System.out.printf("x = " + "%.2f", x);
        System.out.println();
        System.out.printf("y = " + "%.2f", y);
    }
}
