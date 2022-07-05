package Doit_Algorithm_Datatype.chap02;

import java.util.Scanner;

public class DayOfYear_Q9 {


    static int[][] mdays = {

            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},   // 평년
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}    // 윤년

    };

    // 서기 year 년은 윤년인가? (윤년 : 1 / 평년 : 0)
    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1: 0;
    }

    // 서기 y년 m월 d일의 그 해 경과 일 수를 구함
    static int dayOfYear(int y, int m, int d) {
        m -= 1;

        while (m > 0) {
            d += mdays[isLeap(y)][--m];
        }

        return d;
    }

    static int leftDayOfYear(int y, int m, int d) {

        int days = dayOfYear(y, m, d);

        if ( isLeap(y) == 0 ) {
            return 365 - days;
        } else {
            return 366 - days;
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int retry;


       System.out.println("그 해 남은 일수를 구합니다.");

        do {
            System.out.print("년 : "); int year    = scanner.nextInt();     // 년
            System.out.print("월 : "); int month   = scanner.nextInt();     // 월
            System.out.print("일 : "); int day     = scanner.nextInt();     // 일

            System.out.printf("그 해 남은 일은 %d 일입니다.\n", leftDayOfYear(year, month, day));
            System.out.print("한 번 더 할까요? (1.예/0.아니오) : ");

            retry = scanner.nextInt();
        } while (retry == 1);



    }

}
