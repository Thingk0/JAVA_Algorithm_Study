package Doit_Algorithm_Datatype.chap02;

public class YMD_Q11 {

    int y, m, d;

    YMD_Q11(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},   // 평년
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},   // 윤년
    };

    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1: 0;
    }

    YMD_Q11 after(int n) {
        YMD_Q11 temp = new YMD_Q11(this.y, this.m, this.d);

        if ( n < 0 )
            return before(-n);

        temp.d += n;

        while (temp.d >= mdays[isLeap(temp.y)][temp.m-1]) {
            temp.d -= mdays[isLeap(temp.y)][temp.m-1];
            temp.m++;

            if (temp.m > 12) {
                temp.y++;
                temp.m = 0;
            }

        }

        return temp;
    }

    YMD_Q11 before(int n) {

        YMD_Q11 temp = new YMD_Q11(this.y, this.m, this.d);

        temp.d -= n;

        while ( temp.d <= 0) {

            temp.m--;

            if (temp.m < 0) {
                temp.y--;
                temp.m = 11;
            }

            temp.d += mdays[isLeap(temp.y)][temp.m-1];
        }

        return temp;
    }

    public static void main(String[] args) {

        YMD_Q11 test = new YMD_Q11(2022, 5, 20).after(50);
        System.out.printf("%d년 %d월 %d일\n", test.y, test.m, test.d);

        YMD_Q11 test2 = new YMD_Q11(2022, 5, 20).before(50);
        System.out.printf("%d년 %d월 %d일\n", test2.y, test2.m, test2.d);

    }
}
