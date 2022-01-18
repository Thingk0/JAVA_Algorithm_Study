package chap01;

import java.util.Scanner;

public class Practice_Q14 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("사각형을 출력합니다.");
        System.out.print("단 수 : ");
        int length_of_side = scanner.nextInt();

        for (int i=1; i<=length_of_side; i++){
            for (int j=1; j<=length_of_side; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
