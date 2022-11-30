// 백준
// 2438

// 문제)
// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

// 입력)
// 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

// 출력)
// 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

// 예제 입력)
// 5

// 예제 출력)
// *
// **
// ***
// ****
// *****


package algorithm.step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A2438 {

	public static void main(String[] args) throws IOException {
	
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	  
	  int line = Integer.parseInt(br.readLine());
	  br.close();
	  
	  for(int i = 1; i <= line; i++) {
		  
        for(int j = 1; j <= i; j++) {
        	
		  bw.write("*");
		  
        } 
        
        bw.append("\n");
        
	  }
	  
	  bw.flush();
	  bw.close();

	}

}

// bw.append("\n") 대신 bw.newLine() 도 가능


// 다른 방법

//package algorithm.step04;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class A2438 {
//	
//	public static void main(String[] args) throws IOException {
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		
//		int line = Integer.parseInt(br.readLine());
//		br.close();
//		
//		for(int i = 1; i <= line; i++) {
//		  for(int j = 1; j <=i; j++) {
//		    sb.append("*");
//		  }
//		    sb.append("\n");
//		}
//		
//		System.out.println(sb);
//		
//	}
//}

