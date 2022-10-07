// 백준
// 2480

// 문제)
// 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다. 
//
// 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
// 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
// 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
// 예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 
// 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 
// 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
// 3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
 
// 입력)
// 첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다. 

// 출력)
// 첫째 줄에 게임의 상금을 출력 한다.

// 예제 입력) - 예제 출력)
// 3, 3, 6 - 1300  /  2, 2, 2 - 12000  /  6, 2, 5 - 600

package algorithm.step02;

import java.util.Scanner;

public class A2480 {

  public static void main(String[] args) {
		
  Scanner sc = new Scanner(System.in);
	
  int result = 0;    
  int a = sc.nextInt();
  int b = sc.nextInt();
  int c = sc.nextInt();

  if (a == b && b == c) {
    result = 10000 + (a * 1000);
  } else if (a == b) {
    if (a != c && b != c) {
      result = 1000 + (a * 100);
	}
  } else if (a == c) {
    if (a != b && c != b) {
      result = 1000 + (a * 100);
	}
  } else if (b == c) {
	if (b != a && c != a) {
	  result = 1000 + (b * 100);
	}
  } else if (a != b && b !=c && a !=c) {
    int temp = 0;
	int[] arr = {a, b, c};
	for (int i = 0; i < arr.length; i++) {
      if (temp < arr[i]) {
	    temp = arr[i];
		result = temp * 100;
	  }  
	}
    }
	System.out.println(result);
	sc.close();
	}
}


// 다른 방법

//import java.util.Scanner;
//import java.util.*;
//
//public class A2480 {
//
//	public static void main(String[] args) {
//		
//	Scanner sc = new Scanner(System.in);
//	
//	int a = sc.nextInt();
//	int b = sc.nextInt();
//	int c = sc.nextInt();
//
//	
//	int[] arr = {a, b, c};
//	
//
//	Map<Integer, Integer> resultMap = new HashMap<>();
//	
//	for(int i = 0; i < arr.length; i++) {
//		
//		int numberCurrent = 0;
//		
//		for(int j = 0; j < arr.length; j++) {
//			
//			if(arr[i] == arr[j]) {
//				
//				numberCurrent++;
//				
//			}
//			
//		}
//		resultMap.put(arr[i], numberCurrent);
//	}
//	
//	int result = 0;
//	int keyMax = -9999;
//	for (Integer key : resultMap.keySet()) {
//		
//		if(resultMap.get(key) == 3) {
//			result = 10000 + (key * 1000);
//			break;
//		}
//		
//		if(resultMap.get(key) == 2) {
//			result = 1000 + (key * 100);
//			break;
//		}
//
//		if(resultMap.get(key) == 1) {
//			keyMax = keyMax < key ? key : keyMax;
//			result = keyMax * 100;
//		}
//	}
//	
//	System.out.println(result);
//	
//	sc.close();
//	}
//}

