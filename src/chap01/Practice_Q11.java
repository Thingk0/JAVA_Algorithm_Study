package chap01;

import java.util.Scanner;

public class Practice_Q11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.print("정수 값 : ");
            num = scanner.nextInt();
        } while (num <= 0);

        int number_of_digits = 0;
        while (num != 0){
            num /= 10;
            number_of_digits++;
        }

        System.out.println("그 수는 " + number_of_digits + "자리입니다.");
    }
}
