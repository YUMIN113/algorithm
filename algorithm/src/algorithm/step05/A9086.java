// 백준
// 9086

// 문제)
// 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.

// 입력)
// 입력의 첫 줄에는 테스트 케이스의 개수 T(1 ≤ T ≤ 10)가 주어진다. 각 테스트 케이스는 한 줄에 하나의 문자열이 주어진다.
// 문자열은 알파벳 A~Z 대문자로 이루어지며 알파벳 사이에 공백은 없으며 문자열의 길이는 1000보다 작다.

// 출력)
// 각 테스트 케이스에 대해서 주어진 문자열의 첫 글자와 마지막 글자를 연속하여 출력한다.

// 예제 입력)
// 3
// ACDKJFOWIEGHE
// O
// AB

// 예제 출력)
// AE
// OO
// AB

package algorithm.step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A9086 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            String str = br.readLine();
            sb.append(String.valueOf(str.charAt(0)) + String.valueOf(str.charAt(str.length()-1)) + "\n");
        }
        System.out.print(sb);
    }
}

// charAt(index)
// 문자열에서 인자로 주어진 값에 해당하는 문자를 리턴한다.
// index는 '0'부터 시작.

// String.valueOf() 통해서 char 를 String 으로 변환
// The java string valueOf() method converts different types of values into string.

// String.valueOf() vs Object.toString()
// If the argument is null, then "String.valueOf()" will return a String equal to "null".
// In the case of "Object.toString()", if the argument is null, a "NullPointerException" will be thrown.
