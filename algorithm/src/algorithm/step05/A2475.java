// 백준
// 2475

// 문제)
// 컴퓨터를 제조하는 회사인 KOI 전자에서는 제조하는 컴퓨터마다 6자리의 고유번호를 매긴다.
// 고유번호의 처음 5자리에는 00000부터 99999까지의 수 중 하나가 주어지며 6번째 자리에는 검증수가 들어간다.
// 검증수는 고유번호의 처음 5자리에 들어가는 5개의 숫자를 각각 제곱한 수의 합을 10으로 나눈 나머지이다.
// 예를 들어 고유번호의 처음 5자리의 숫자들이 04256이면, 각 숫자를 제곱한 수들의 합 0+16+4+25+36 = 81 을 10으로 나눈 나머지인 1이 검증수이다.

// 입력)
// 첫째 줄에 고유번호의 처음 5자리의 숫자들이 빈칸을 사이에 두고 하나씩 주어진다.

// 출력)
// 첫째 줄에 검증수를 출력한다.

// 예제 입력)
// 0 4 2 5 6

// 예제 출력)
// 1

package algorithm.step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2475 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int sum = 0;

        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < 5; i++) {
            int num = Integer.parseInt(st.nextToken());
            sum += num * num;
        }
        int result = sum % 10;
        System.out.print(result);
    }
}

// 다른 방법
// Math.pow(base, exponent)
// base, exponent 모두 Double type
// 따라서 정수형으로 출력하려면 형변환 필요.

// package algorithm.step05;
//
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.StringTokenizer;
//
// public class A2475 {
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        double sum = 0;
//
//        st = new StringTokenizer(br.readLine(), " ");
//
//        for(int i = 0; i < 5; i++) {
//            double num = Double.parseDouble(st.nextToken());
//            sum += Math.pow(num, 2);
//        }
//        int result = (int) sum % 10;
//        System.out.print(result);
//    }
// }

