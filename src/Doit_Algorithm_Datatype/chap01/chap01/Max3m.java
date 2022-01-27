package Doit_Algorithm_Datatype.chap01.chap01;

public class Max3m {
    static int max3(int a, int b, int c){
        int max = a;
        if ( b > max)
            max = b;
        if ( c > max)
            max = c;

        return max;
    }

    public static void main(String[] args){
        System.out.println(max3(3,2,1));
        System.out.println(max3(5,6,10));
        System.out.println(max3(-5,-15,1));
        System.out.println(max3(30,12,100));
        System.out.println(max3(-3,-2,-1));
    }
}
