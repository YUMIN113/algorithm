// 백준
// 10872

// 문제)
// 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

// 입력)
// 첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.

// 출력)
// 첫째 줄에 N!을 출력한다.

// 예제 입력)
// 10

// 예제 출력)
// 3628800

// 예제 입력)
// 0

// 예제 출력)
// 1


package algorithm.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A10872 {

	public static void main(String[] args) throws IOException {
	  
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int result = 1;
      
      int factorial = Integer.parseInt(br.readLine());
      
      br.close();
      
      for(int i = 1; i <= factorial; i++) {
    	  
    	  result = result * i;
    	  
    	  if(factorial == 0) {
    		  
    		  result = 1;
    		  break;
    	  }
    	  
      }
     
        System.out.println(result);

	}

}

// 다른 방법

//package algorithm.step04;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class A10872 {
//
//	public static void main(String[] args) throws IOException {
//	  
//      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      
//      int result = 1;
//      
//      int factorial = Integer.parseInt(br.readLine());
//      
//      br.close();
//      
//      for(int i = 1; i <= factorial; i++) {
//    	  
//    	  result *= i;
//    	  
//      }
//     
//        System.out.println(result);
//
//	}
//
//}