package Doit_Java.chapter2;

public class Constant {
    public static void main(String[] args){
        final int MAX_NUM = 100;
        final float PI = 3.14f;
        // PI = 3.15; // 값 수정 불가x

        final int STUDENT_NUM = 30;

        int num = 0;
        if (num == STUDENT_NUM) {}

        System.out.println(STUDENT_NUM);
    }
}