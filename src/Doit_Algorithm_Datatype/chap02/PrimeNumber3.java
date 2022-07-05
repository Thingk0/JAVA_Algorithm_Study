package Doit_Algorithm_Datatype.chap02;

public class PrimeNumber3 {
    public static void main(String[] args) {
        int counter = 0;                                    // 곱셈과 나눗셈의 횟수
        int ptr = 0;                                        // 찾은 소수의 개수
        int[] prime = new int[500];                         // 소수를 저장하는 배열

        prime[ptr++] = 2;                                   // 소수 2
        prime[ptr++] = 3;                                   // 소수 3

        for (int n = 5; n <= 1000; n += 2) {                // 짝수는 소수가 될 수 없기 때문에 홀수만 조사
            boolean flag = false;
            for (int i = 1; prime[i] * prime[i] <= n; i++) {
                counter += 2;                               // 곱셈 한번, 나눗셈 한번 => 두번씩 수행하므로 +2
                if (n % prime[i] == 0) {                    // 나누어 떨어지면 소수가 아님
                    flag = true;
                    break;                                  // 더 이상 반복 x
                }
            }

            if (!flag) {
                prime[ptr++] = n;
                counter++;
            }
        }

        for (int i = 0; i < ptr; i++)                       // 찾은 ptr 개의 소수 출력
            System.out.println(prime[i]);

        System.out.println("곱셈과 나눗셈을 수행한 횟수 : " + counter);
    }
}
