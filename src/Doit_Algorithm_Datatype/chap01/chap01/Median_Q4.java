package Doit_Algorithm_Datatype.chap01.chap01;
// 세 정수값의 중앙값을 구하여 나타냄 (모든 조합의 대소관계에 대하여 검증)

class Med3_01_04 {
    // a, b, c의 중앙값을 구하여 반환
    static int med3(int a, int b, int c) {
        // a=1, b=3, c=2
        // a=5, b=4, c=3
        if (a >= b)
            // 1 >= 3 (x)
            // 5 >= 4 (o)
            if (b >= c)
                // 4 >= 3 (o)
                return b;
            else if (a <= c)
                return a;
            else
                return c;
        else if (a > c) // 1 > 2 (x)
            return a;
        else if (b > c) // 3 > 2 (o)
            return c;
        else
            return b;
    }

    public static void main(String[] args) {
        System.out.println("med3(3,2,1) = " + med3(3, 2, 1)); // a＞b＞c
        System.out.println("med3(3,2,2) = " + med3(3, 2, 2)); // a＞b＝c
        System.out.println("med3(3,1,2) = " + med3(3, 1, 2)); // a＞c＞b
        System.out.println("med3(3,2,3) = " + med3(3, 2, 3)); // a＝c＞b
        System.out.println("med3(2,1,3) = " + med3(2, 1, 3)); // c＞a＞b
        System.out.println("med3(3,3,2) = " + med3(3, 3, 2)); // a＝b＞c
        System.out.println("med3(3,3,3) = " + med3(3, 3, 3)); // a＝b＝c
        System.out.println("med3(2,2,3) = " + med3(2, 2, 3)); // c＞a＝b
        System.out.println("med3(2,3,1) = " + med3(2, 3, 1)); // b＞a＞c
        System.out.println("med3(2,3,2) = " + med3(2, 3, 2)); // b＞a＝c
        System.out.println("med3(1,3,2) = " + med3(1, 3, 2)); // b＞c＞a
        System.out.println("med3(2,3,3) = " + med3(2, 3, 3)); // b＝c＞a
        System.out.println("med3(1,2,3) = " + med3(1, 2, 3)); // c＞b＞a
    }

    // Check - 22.04.22
}
