package Doit_Algorithm_Datatype.chap01.chap01;

public class Max3m_Q2 {
    static int min3(int a, int b, int c){
        int min = a;
        if ( b < min)
            min = b;
        if ( c < min)
            min = c;

        return min;
    }

    public static void main(String[] args){
        System.out.println(min3(3,2,1));
    }

    // Check - 22.04.22
}
