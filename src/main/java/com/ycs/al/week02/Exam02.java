
// - 문제 
// 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

// - 입력
// 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

// - 출력
// 첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.

package com.ycs.al.week02;

public class Exam02 {
  public static void main(String[] args) {

		java.util.Scanner scanner = new java.util.Scanner(System.in);

		double A = scanner.nextDouble();
		double B = scanner.nextDouble();

		System.out.println(A/B);
	}	
}
 // 상대오차가 10의 -9승 이내여야 한다. => 소수점 아래 9자리 이상 표현할 수 있어야 한다.
 // double 정밀도 : 15자리