// 백준
// 2741

// 문제)
// 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

// 입력)
// 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.

// 출력)
// 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.

// 예제 입력)
// 5

// 예제 출력)
// 1
// 2
// 3
// 4
// 5

package algorithm.step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A2741 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		for(int i = 1; i <= n; i++) {
			
			bw.write(i + "\n");
		}
		
			bw.flush();
			bw.close();
		
	}
}

// 다른 방법

//package algorithm.step04;
//
//import java.util.Scanner;
//
//public class A2741 {
//
//	public static void main(String[] args) {
//	  
//	  Scanner sc = new Scanner(System.in);
//	  
//	  int n = sc.nextInt();
//	  
//	  for(int i = 1; i <= n; i++) {
//		  
//		  System.out.println(i);
//	  }
//	  
//	  sc.close();
//
//	}
//
//}

