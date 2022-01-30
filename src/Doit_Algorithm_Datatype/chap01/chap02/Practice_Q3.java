package Doit_Algorithm_Datatype.chap01.chap02;

import java.util.Scanner;

public class Practice_Q3 {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 배열 a의 요소를 역순으로 정렬
    static void reverse(int[] a) {
        for ( int i = 0; i < a.length / 2; i++)
            swap(a, i, a.length-i-1);
    }

    static int sumOf(int[] a) {
        int sum = 0;
        for (int i=0; i<a.length; i++){
            sum += a[i];
        }

        return sum;
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

        System.out.println("요소를 역순으르 정렬했습니다.");
        for (int i = 0; i < num; i++)
            System.out.println("x[" + i + "] = " + x[i]);

        System.out.printf("모든 요소의 합 : %d",sumOf(x));
    }
}
