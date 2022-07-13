package com.ycs.al.ex01;

public class Exam02 {
  public static void main(String[] args) {
    
    java.util.Scanner keyboardInput = new java.util.Scanner(System.in);

    System.out.println("문자를 입력하시오");

    String str = keyboardInput.nextLine();

    java.util.StringTokenizer s = new java.util.StringTokenizer(str);

    System.out.println();
    System.out.println(s.countTokens());
   

  }
}
