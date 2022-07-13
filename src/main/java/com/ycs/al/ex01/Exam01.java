
// - 문제
// 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 
// 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

// - 입력
// 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

// -출력
// 시험 성적을 출력한다.

// - 예제 입력 및 출력
// 100 / A


package com.ycs.al.ex01;

public class Exam01 {
  public static void main(String[] args) {

    System.out.println();
    System.out.println("[성적확인]");
    System.out.println();

    java.util.Scanner keyboardInput = new java.util.Scanner(System.in);

    System.out.print("점수를 입력하세요[0 ~ 100] : ");

    boolean flag = true;

    while (flag) { 
      int score = keyboardInput.nextInt();
      keyboardInput.nextLine();

      System.out.println();

      if (score < 0 || score > 100) {
        System.out.print("재입력하세요[0 ~ 100] : ");
        continue;
      } else if (90 <= score && score <= 100) {
        System.out.println("성적 : A"); 
      } else if (80 <= score && score <= 89) {
        System.out.println("성적 : B");
      } else if (70 <= score && score <= 79) {
        System.out.println("성적 : C");
      } else if (60 <= score && score <= 69) {
        System.out.println("성적 : D");
      } else {
        System.out.println("성적 : F");
      }
      flag = false;
    }
  }
}  
