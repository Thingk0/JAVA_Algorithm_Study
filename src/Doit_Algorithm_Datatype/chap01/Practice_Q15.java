package Doit_Algorithm_Datatype.chap01;

import java.util.Scanner;

public class Practice_Q15 {

    static void triangleLB(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    static void triangleLU(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<=n-i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    static void triangleRU(int n){
        for(int i=1; i<=n; i++){

            for(int k=1; k<i; k++)
                System.out.print(" ");

            for(int j=0; j<=n-i; j++)
                System.out.print("*");

            System.out.println();
        }
    }

    static void triangleRB(int n){
        for(int i=1; i<=n; i++){

            for(int k=0; k<n-i; k++)
                System.out.print(" ");

            for(int j=1; j<=i; j++)
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

        triangleLB(n);
        System.out.println();
        triangleLU(n);
        System.out.println();
        triangleRU(n);
        System.out.println();
        triangleRB(n);
    }

    // Check - 22.04.22
}
