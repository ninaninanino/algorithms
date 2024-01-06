import java.util.Scanner;

class baekjoon8393 {
/*
#8393
n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
*/
    public static void main(String[] args){
        // 1. 입력받기
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        //2. 입력값 validation
        if (1 > n || n > 10000) return;

        // 3. 계산 & 출력
        System.out.println( (1+n)*n/2 );
    }
}