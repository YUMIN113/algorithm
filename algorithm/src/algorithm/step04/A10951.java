// 백준
// 10951

// 문제)
// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

// 입력)
// 입력은 여러 개의 테스트 케이스로 이루어져 있다.
// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

// 출력)
// 각 테스트 케이스마다 A+B를 출력한다.

// 예제 입력)
// 1 1
// 2 3
// 3 4
// 9 8
// 5 2

// 예제 출력)
// 2
// 5
// 7
// 17
// 7


package algorithm.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A10951 {

  public static void main(String[] args) throws IOException {
	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringBuilder sb = new StringBuilder();
    
    StringTokenizer st;
    
    while(true) {
    	try {
    	  st = new StringTokenizer(br.readLine(), " ");
    	  int a = Integer.parseInt(st.nextToken());
    	  int b = Integer.parseInt(st.nextToken());
    	  sb.append((a + b) + "\n");
    	  
    	} catch(Exception e) {
    		
    		break;
    		
    	}
    }

        System.out.println(sb);
    
	}

}

// 숫자 입력 > enter > enter 일 경우, 오류 발생 
// BufferedReader에서 br.readLine()은 enter 즉 '\n'까지 한 라인으로 읽는다. enter도 데이터 값으로 읽게된다.
// 어떤 값도 입력하지 않고 enter 했을 경우, 빈문자열이 st에 저장된다. 여기까지는 문제 없이 진행된다.
// 하지만, 빈문자열에서 공백으로 분리 된 문자열이 없기 때문에 토큰을 뽑으려고 할 경우, 오류가 발생하게 된다.

