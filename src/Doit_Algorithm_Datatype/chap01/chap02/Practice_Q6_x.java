package Doit_Algorithm_Datatype.chap01.chap02;

import java.util.Scanner;

class Practice_Q6_x {
    static int cardConvR(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while ( x != 0 );

        for (int i = 0; i < digits /  2; i++) {
            char temp = d[i];
            d[i] = d[digits-i-1];
            d[digits-i-1] = temp;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int no, cd, dno, retry;
        char[] cno = new char[32];

        System.out.print("10진수를 기수 변환합니다.");
        do {
            do {
                System.out.print("변환하는 음이 아닌 정수 : ");
                no = scanner.nextInt();
            } while ( no < 0);

            do {
                System.out.print("어떤 진수로 변환할까요? (2~36) : ");
                cd = scanner.nextInt();
            } while ( cd < 2 || cd > 36);

            dno = cardConvR(no, cd, cno);

            System.out.print(cd + "진수로는 ");
            for (int i=0; i < dno; i++)
                System.out.print(cno[i]);
            System.out.println("입니다.");

            System.out.print("한번 더 할까요? (1.예 / 0.아니오) : ");
            retry = scanner.nextInt();

        } while ( retry == 1);
    }

    // Check - 22.04.22
}
