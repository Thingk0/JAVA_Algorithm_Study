package Doit_Algorithm_Datatype.chap02;

import java.util.Scanner;

public class Practice_Q3 {

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

        System.out.printf("모든 요소의 합 : %d",sumOf(x));
    }

    // Check - 22.04.22
}
