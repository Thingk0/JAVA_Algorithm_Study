package Doit_Algorithm_Datatype.chap02;

import java.util.Scanner;

class Practice_Q7 {
    static void cardConvR(int x, int r, char[] d) {
        StringBuilder sb = new StringBuilder();

        int digits = 0;
        int temp = 0;

        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.printf("%d | %4d\n", r, x);
        d[digits] = dchar.charAt(x % r);
        x /= r;

        do {

            temp = Integer.parseInt(String.valueOf(d[digits++]));
            sb.append(temp);

            d[digits] = dchar.charAt(x % r);
            System.out.println("  +------");
            System.out.printf("%d | %4d ... %d\n", r, x, temp);
            x /= r;

        } while ( x != 0 );

        System.out.println("  +------");
        System.out.printf("    %4d ... %d\n", x, temp);
        System.out.printf("%d진수로 %s입니다.\n", r, sb.append(temp).reverse());

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int no, cd, retry;
        char[] cno = new char[32];

        System.out.println("10진수를 기수 변환합니다.");
        do {

            do {
                System.out.print("변환하는 음이 아닌 정수 : ");
                no = scanner.nextInt();
            } while ( no < 0);

            do {
                System.out.print("어떤 진수로 변환할까요? (2~36) : ");
                cd = scanner.nextInt();
            } while ( cd < 2 || cd > 36);

            cardConvR(no, cd, cno);

            System.out.print("한번 더 할까요? (1.예 / 0.아니오) : ");
            retry = scanner.nextInt();

        } while ( retry == 1);
    }

    // Check - 22.04.22
}
