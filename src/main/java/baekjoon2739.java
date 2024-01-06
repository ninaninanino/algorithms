import java.util.Scanner;

class baekjoon2739 {
/*
#2739, 구구단
N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다. */
    public static void main(String[] args){
       // 1. 입력받기
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

       // 2. 인풋값 validation
       if (1 > N || N > 9 ){
           return;
       }
       // 3. 계산
        for (int multi=1; multi < 10 ; multi++){
            System.out.println(N + " * " + multi + " = " + N*multi);
        }
    }
}