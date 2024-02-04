import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

@Slf4j
/*
X대학 M교수님은 프로그래밍 수업을 맡고 있다.
교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.
교수님이 내준 특별과제를 28명이 제출했는데,
그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.
 */
public class baekjoon5597 {
    public static void main(String[] args) throws IOException {
        //입력은 총 28줄
        //각 제출자(학생)의 출석번호 n(1 ≤ n ≤ 30)가 한 줄에 하나씩 주어진다.
        //출석번호에 중복은 없다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //1. 입력값 input 이라는 깡통을 일단 선언. 자료형은 hashset
        Set<Integer> input = new HashSet<>();

        //2. Hashset input 깡통 채우기: value인 submitted를 input이라는 해시셋 깡통에 넣는다.
        for (int i=0;i<28;i++){
            int submitted =Integer.parseInt(br.readLine());
            if (1> submitted || submitted >30) return;
            input.add(submitted);
        } // 이제 input은 더이상 깡통 아니고 값이 들어가있는 HashSet이 되었음.

        for (int i=1 ; i<=30 ; i++){
            if(!input.contains(i)) {
                System.out.println(i);
            }
        }
        br.close();
    }
}