// 백준
// 10699

// 문제)
// 서울의 오늘 날짜를 출력하는 프로그램을 작성하시오.

// 입력)
// 입력은 없다.

// 출력)
// 서울의 오늘 날짜를 "YYYY-MM-DD" 형식으로 출력한다.


package algorithm.step04;

import java.time.LocalDate;

public class A10699 {
	
	public static void main(String[] args) {
	
	  LocalDate localDate = LocalDate.now();
	
	  System.out.println(localDate);
	
	}

}


// LocalDate Class : 년, 월, 일 정보만 가짐.
// LocalDate.now() : 오늘 년, 월, 일 정보 나타냄.