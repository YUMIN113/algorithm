// 백준
// 10871

// 문제)
// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
// 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

// 입력)
// 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
// 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다.
// 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.

// 출력)
// X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.

// 예제 입력)
// 10 5
// 1 10 4 9 2 3 8 5 7 6

// 예제 출력)
// 1 4 2 3


package algorithm.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A10871 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        String numberLine = br.readLine();
        br.close();

        String[] numberStrs = numberLine.split(" ");

        // String > int 변환
        int[] numbers = new int[numberStrs.length];
        for(int i = 0; i < numberStrs.length; i++) {
            numbers[i] = Integer.parseInt(numberStrs[i]);
            if(numbers[i] < x) {
                stb.append(numbers[i] + " ");
            }
        }
        System.out.print(stb);
    }
}

// 다른 방법

// package algorithm.step04;
//
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.Arrays;
// import java.util.List;
// import java.util.StringTokenizer;
// import java.util.stream.Collectors;
//
// public class A10871 {
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder stb = new StringBuilder();
//        StringTokenizer st;
//
//        st = new StringTokenizer(br.readLine(), " ");
//        int n = Integer.parseInt(st.nextToken());
//        int x = Integer.parseInt(st.nextToken());
//
//        String numberLine = br.readLine();
//        br.close();
//
//        // String > int 변환
//        List<Integer> arr =
//                Arrays.stream(numberLine.split(" "))
//                      .map(it -> Integer.parseInt(it))
//                      .collect(Collectors.toList());
//
//        for(int numbers : arr) {
//            if(numbers < x) {
//                stb.append(numbers + " ");
//            }
//        }
//        System.out.print(stb);
//    }
// }
