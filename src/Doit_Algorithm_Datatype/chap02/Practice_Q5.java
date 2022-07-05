package Doit_Algorithm_Datatype.chap02;

import java.util.Scanner;

public class Practice_Q5 {
    static void rcopy(int[] a, int[] b) {
        for ( int i=0; i < b.length; i++ )
            a[b.length-i-1] = b[i];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열 b의 요솟수 : ");
        int nb = scanner.nextInt();

        int[] b = new int[nb];

        for (int i = 0; i < nb; i++){
            System.out.printf("b[%d] : ",i);
            b[i] = scanner.nextInt();
        }

        int[] a = new int[b.length];
        rcopy(a, b);

        System.out.print("배열 b : ");
        for (int factor : b) {
            System.out.print(factor + " ");
        }

        System.out.println();

        System.out.print("배열 a : ");
        for (int factor : a) {
            System.out.print(factor + " ");
        }



    }

    // Check - 22.04.22
}
