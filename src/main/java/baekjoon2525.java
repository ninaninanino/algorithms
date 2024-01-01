import java.time.Duration;
import java.util.Scanner;

/**
 * 백준 2525번 baekjoon2525
 * 오븐 시계
 * 2024.01.01
 */
class baekjoon2525 {
    public static void baekjoon2525(String[] args) {
        // 1. 입력값 받기
        Scanner sc = new Scanner(System.in);
        int hh = 0;
        int mm = 0;
        int rest = 0;

        try {
            String[] t = sc.nextLine().split(" ");
            hh = Integer.parseInt(t[0]);
            mm = Integer.parseInt(t[1]);
            rest = Integer.parseInt(sc.nextLine());
        }
        catch(NumberFormatException | ArrayIndexOutOfBoundsException e) {
            return;
        }

        // 2-1. 예외 아닐 때 처리
        if (0 <= hh && hh <=23 && 0 <= mm && mm <= 59 && 0<= rest && rest <= 1000) {
            Duration duration = Duration.ofMinutes(rest);
            int restH = (int) duration.toHours();
            int restM = duration.toMinutesPart();

            /* max는 23시 59분에 59분 더하는 케이스 --> 0시 58분
             min은 0시 0분에 0 더하는 케이스 --> 0시 0분
             mm + rest 가 60을 넘으면 hh에 1 추가
                hh가 23보다 크면 hh +1 -24 해줌
                hh가 23보다 작으면 hh +1
             mm + rest 60 안 넘으면 hh 유지
             */

//            if (mm+restM >= 60){
//                mm += restM - 60;
//
//                if ( (hh + restH) < 23) { // 시간+추가시간이 23시 전일때
//                    hh += restH + 1 ;
//                }
//                else { // 시간+추가시간이 23시 후일때
//                    hh += restH + 1 - 24 ;
//                }
//            } else{ // 분단위 합이 60분 미만일때
//                hh += restH ;
//                mm += restM ;
//            }
            mm += restM;
            hh += restH + mm/60;
            mm %= 60;
            hh %= 24;

            System.out.println(hh + " " + mm);
        }
        // 2-2. 예외처리
        else {
        }


    }
}