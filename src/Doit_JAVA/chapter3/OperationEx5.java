package Doit_JAVA.chapter3;

public class OperationEx5 {
    public static void main(String[] args){

        int num1 = 5;  // 0000 0101
        int num2 = 10; // 0000 1010

        int result = num1 & num2;
        System.out.println(result);

        result = num1 | num2;
        System.out.println(result);

        result = num1 ^ num2;
        System.out.println(result);

        int num3 = 5; // 0000 0101
        System.out.println(num3 << 1); // x2
        System.out.println(num3 << 2); // x2 x2
        System.out.println(num3 << 3); // x2 x2 x2

        System.out.println(num3);      // 0000 0101
        System.out.println(num3 >> 1); // 0000 0010 1(x)
        System.out.println(num3 >> 2); // 0000 0001 01(x)
    }
}
