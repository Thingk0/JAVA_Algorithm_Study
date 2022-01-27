package Doit_Java.chapter3;

public class OperationEx4 {
    public static void main(String[] args){
       int num1 = 10;
       System.out.println(num1 += 1);

       System.out.println(num1 %= 10);
       num1 -= 1;
       System.out.println(num1);

       int num = ( 5 > 3) ? 10: 20; // 5가 3보다 클 경우 10을 출력, 아니면 20을 출력
       System.out.println(num);
    }
}
