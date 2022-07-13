
// - 문제
// 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 
// 이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.

// - 입력
// 첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열의 길이는 1,000,000을 넘지 않는다. 
// 단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 
// 또한 문자열은 공백으로 시작하거나 끝날 수 있다.

// - 출력
// 첫째 줄에 단어의 개수를 출력한다.

// - 예제 입력 및 출력
// The Curious Case of Benjamin Button / 6

// 방법1
package com.ycs.al.ex01;

public class Exam02 {
  public static void main(String[] args) {
    
    java.util.Scanner keyboardInput = new java.util.Scanner(System.in);
    System.out.println("문자열을 입력하시오.");
    String str = keyboardInput.nextLine();

    java.util.StringTokenizer s = new java.util.StringTokenizer(str);

    System.out.println();
    System.out.println(s.countTokens());
    keyboardInput.close();

  }
}

// 방법2
// package com.ycs.al.ex01;

// public class Exam02 {
//   public static void main(String[] args) {
    
//     java.util.Scanner keyboardInput = new java.util.Scanner(System.in);
//     System.out.println("문자열을 입력하시오.");
//     String str = keyboardInput.nextLine();

//     int result = str.split(" ").length; // arr.length와 비슷한 형식

//     System.out.println();
//     System.out.println(result);
//     keyboardInput.close();

//   }
// }
