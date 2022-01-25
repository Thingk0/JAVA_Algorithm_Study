package chap01;

import java.util.Scanner;

public class SumFor_Q7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값 : ");
        int n = scanner.nextInt();

        int sum = 0;

        for(int i =1; i<=n; i++){
            sum += i;
            if (i != n)
                System.out.printf("%d + ",i);
            else
                System.out.printf("%d",i);
        }

        System.out.printf(" = %d", sum);
    }
}
