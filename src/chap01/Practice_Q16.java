package chap01;

import java.util.Scanner;

public class Practice_Q16 {

    static void spira(int n){
        for(int i=1; i<=n; i++) {
            for(int l=0; l<=n-i; l++)
                System.out.print(" ");

            for(int s=1; s<=((i*2)-1); s++)
                System.out.print("*");

            System.out.println();
        }
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("몇 단 삼각형입니까? : ");
            n = scanner.nextInt();
        } while (n <= 0);

        spira(n);

    }
}
