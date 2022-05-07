package Doit_Algorithm_Datatype.chap01.chap02;

import java.util.Scanner;

public class Practice_Q2 {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void print(int[] a) {
        for (int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    // 배열 a의 요소를 역순으로 정렬
    static void reverse(int[] a) {
        print(a);
        for ( int i = 0; i < a.length / 2; i++){
            System.out.printf("a[%d]과(와) a[%d]를 교환합니다.\n", i, a.length-i-1);
            swap(a, i, a.length-i-1);
            print(a);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scanner.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        reverse(x);
        System.out.println("역순 정렬을 마쳤습니다.");

    }

    // Check - 22.04.22
}
