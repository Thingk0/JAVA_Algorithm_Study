package chap01;

import java.util.Scanner;

public class SumFor_Q8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값 : ");
        int n = scanner.nextInt();

        int sum = 0;

        for(int i =1; i<=n; i++){
            sum += i;
        }

        if (n % 2 == 0)
            System.out.println((1+n)*(n/2));
        else
            System.out.println((1+n)*Math.round(9/2) + Math.round(9/2.0));

        int _sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); // 합
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
