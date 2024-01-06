import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
class baekjoon25314 {
/*
#25314,코딩은 체육과목입니다.
Q. “만약, 입출력이 N 바이트 크기의 정수라면 프로그램을 어떻게 구현해야 할까요?”
long int :4 byte
long long int: 8 byte

입력:  첫 번째 줄에는 문제의 정수n (4<= n<= 1000, n%4==0)
출력: n바이트 정수까지 저장할 수 있다고 생각하는 "정수 자료형의 이름"
*/

    public static void main(String[] args){
        // 1. 입력받기
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
//        log.info(String.valueOf(n));

        //2. valdation
        if (4>n|| n > 1000 || n%4 !=0 ) return;

        //3. print. 참고로 string변수.append안된다고함. string자체가 final같은거라 형변경불가
        //이럴땐 stringbuilder를 쓴다고한다. 그리고, for 문돌리지않고 이땐 repeat 메서드 쓰라함
        System.out.println("long ".repeat((n / 4)) +"int");
    }
}