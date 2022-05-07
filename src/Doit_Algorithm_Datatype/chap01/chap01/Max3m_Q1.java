package Doit_Algorithm_Datatype.chap01.chap01;

public class Max3m_Q1 {
    static int max4(int a, int b, int c, int d){
        int max = a;
        if ( b > max)
            max = b;
        if ( c > max)
            max = c;
        if ( d > max)
            max = d;

        return max;
    }

    public static void main(String[] args){
        System.out.println(max4(3,2,1,4));
    }

    // Check - 22.04.22
}
