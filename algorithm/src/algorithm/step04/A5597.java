// 백준
// 5597

// 문제)
// X대학 M교수님은 프로그래밍 수업을 맡고 있다. 교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.
// 교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.

// 입력)
// 입력은 총 28줄로 각 제출자(학생)의 출석번호 n(1 ≤ n ≤ 30)가 한 줄에 하나씩 주어진다. 출석번호에 중복은 없다.

// 출력)
// 출력은 2줄이다. 1번째 줄엔 제출하지 않은 학생의 출석번호 중 가장 작은 것을 출력하고, 2번째 줄에선 그 다음 출석번호를 출력한다.

// 예제 입력)
// 3
// 1
// 4
// 5
// 7
// 9
// 6
// 10
// 11
// 12
// 13
// 14
// 15
// 16
// 17
// 18
// 19
// 20
// 21
// 22
// 23
// 24
// 25
// 26
// 27
// 28
// 29
// 30

// 예제 출력)
// 2
// 8

package algorithm.step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class A5597 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<Integer> u = new HashSet<Integer>();
        HashSet<Integer> a = new HashSet<Integer>();

        for(int i = 0; i < 28; i++) {
            a.add(Integer.parseInt(br.readLine()));
        }
        br.close();

        for(int i = 1; i <=30; i++) {
            u.add(i);
        }

        u.removeAll(a);

        ArrayList<Integer> list = new ArrayList<Integer>(u);
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++) {
            bw.write(list.get(i) + "\n");
        }

        bw.flush();
        bw.close();
    }
}

// HashSet() : 순서 없음
// Collections.sort() 통해서 오름차순으로 정렬
// 차집합 : u.removeAll(a)