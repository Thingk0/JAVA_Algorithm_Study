package Doit_Java.chapter2;

public class ImplicitConversion {
    public static void main(String[] args){
        byte bNum = 10;
        int num = bNum;
        System.out.println(num);

        long lNum = 10;
        float fNUm = lNum;
        System.out.println(fNUm);

        double dNum = fNUm + num;
        System.out.println(dNum);
    }
}
