import java.util.Scanner;

/**
 * 백준 2884번
 * 알람시계
 * 2024.01.01
 */
class Main {
    public static void baekjoon2884(String[] args) {
        // 1. 입력값 받기
        Scanner sc = new Scanner(System.in);
        String[] t = sc.nextLine().split(" ");

        int hh = 0;
        int mm = 0;

        try {
            hh = Integer.parseInt(t[0]);
            mm = Integer.parseInt(t[1]);
        }
        catch(NumberFormatException | ArrayIndexOutOfBoundsException e) {
            return;
        }

        // 2-1. 예외 아닐떄 처리
        if (0 <= hh && hh <=23 && 0 <= mm && mm <= 59) {
            //3. 정석처리
            if (hh > 0) {
                if (mm >= 45) { // ex. 10 55  --> 9 10
                    System.out.println(hh + " " + (mm - 45));
                } else { // ex. 1 25 --> 0 40
                    System.out.println(hh - 1 + " " + (mm + 15));
                }
            }
            if (hh < 1) {
                if (mm >= 45) { // ex. 0 55  --> 0 10
                    System.out.println(hh + " " + (mm - 45));
                } else { // ex. 0 25 --> 23 40
                    System.out.println("23" + " " + (mm + 15));
                }
            }
        }
        // 2-2. 예외처리
        else
            return;
    }
}
