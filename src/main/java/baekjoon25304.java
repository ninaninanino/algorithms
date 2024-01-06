import lombok.extern.slf4j.Slf4j;
import java.util.Scanner;
@Slf4j
class baekjoon25304 {
/*
#25304,영수증
영수증에 적힌, 구매한 각 물건의 가격과 개수 구매한 물건들의 총 금액을 보고,
구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.

입력: 첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다.
둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.
이후 N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.

출력: 영수증과 실제값이 일치하면 Yes를 출력한다. 일치하지 않는다면 No를 출력한다.
*/

    public static void main(String[] args){
        // 1. 입력받기
        Scanner input = new Scanner(System.in);
        //(1)총 금액
        int total = input.nextInt();
        if (1>total || total >1000000000) return;
        input.nextLine();

        //(2)총 개수
        int row = input.nextInt();
        if (1 > row || row > 100) return;
        input.nextLine();

        //(3)영수증내역
        /* GPT가 불필요하다고 한 영역임.
        int price =0, ea=0;
        int[][] values = new int[row][2]; //price, ea
         */

        int total_check =0;
        for (int i = 0; i < row; i++) {
            String [] check = input.nextLine().split(" ");
            int price = Integer.parseInt(check[0]);
            int ea = Integer.parseInt(check[1]);
//            log.info(i+"번째 price:"+String.valueOf(price));
//            log.info(i+"번째 ea:"+String.valueOf(ea));

            if (1 > price || price > 1000000||
                    1 > ea || ea > 10) {
                return;
            }
            total_check += price*ea;
//            log.info(String.valueOf(total_check));
        }

        /* scanner 닫아주는거 습관 들이기!!
        gpt: 라인은 Scanner 객체를 닫는 명령입니다.*/
        input.close();
//
//        //2. 입력값 validation
//        if (1>total || total >1000000000||
//            1 > row || row > 100||
//            1 > price || price > 1000000||
//            1 > ea || ea > 10) {
//            return;
//        }

        //3. 계산
//        int total_check = 0;
//        for (int i=0;i<row;i++){
//            log.info(String.valueOf(row));
//            total_check += values[i][0] * values[i][1];
//            System.out.print(row +"번쨰 : "+ values[i][0]+ "*" +values[i][1] + "=" + total_check);
//        }
//
        //4. 출력
        //gpt에 의하면 삼항으로 바로 때려버릴수 있음!!!! 이거 잊지말자!!!
        System.out.println(total_check == total ? "Yes" : "No");
/*        if (total_check == total) {
            System.out.println("Yes");
            log.info("total_check : " + total_check + ", total: "+total);
        }
        else{
            System.out.println("No");
            log.info("total_check : " + total_check + ", total: "+total);
        }*/
    }
}