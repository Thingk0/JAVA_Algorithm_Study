package chap01;

import java.util.Scanner;

public class Practice_Q11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        System.out.println("그 수는 " + number.length() + "자리입니다.");
    }
}
