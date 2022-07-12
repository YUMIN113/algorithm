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
