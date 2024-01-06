import java.util.Scanner;

class baekjoon10950 {
/*
#10950
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
*/
    public static void main(String[] args){

       // 1. 입력받기
        Scanner input = new Scanner(System.in);
        int repeat = input.nextInt();
        //gpt 추가코드
        input.nextLine(); // 남은 줄바꿈 문자 제거용이라고 함.
        int[][] values = new int[repeat][2]; // 입력 값을 저장할 2차원 배열. (repeat개행 * 2개열) 의 배열의미.
        // end of gpt 추가코드

        int a = 0,b = 0;

        for (int i=0; i < repeat ; i++){
            String [] ab = input.nextLine().split(" ");
            a = Integer.parseInt(ab[0]);
            b = Integer.parseInt(ab[1]);

            // 2. 인풋값 validation
            if (0 >= a || b >= 10 ) return;

            //gpt 추가코드
            values[i][0] = a;
            values[i][1] = b;
            // end of gpt 추가코드
        }

       // 3. 계산 & 출력
        for (int j=0; j <repeat ; j++){
            System.out.println(values[j][0]+values[j][1]);
        }
    }
}