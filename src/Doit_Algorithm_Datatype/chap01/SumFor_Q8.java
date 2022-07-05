package Doit_Algorithm_Datatype.chap01;

import java.util.Scanner;

public class SumFor_Q8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값 : ");
        int n = scanner.nextInt();

        if (n % 2 == 0)
            System.out.println( (1+n) * (n/2) );
        else
            // n = 9 일 경우
            // (1+9) * 4 + 5
            System.out.println( (1+n) * (n / 2) + (n+1)/2 );

    }

    // Check - 22.04.22
}
