import java.util.Scanner;

class baekjoon2480 {
/*
baekjoon2480, 주사위세개
1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.

같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.

3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.

 */
    public static void baekjoon2480(String[] args){

         // 1. 변수를 입력받는다.
         Scanner sc = new Scanner(System.in);
         //2. 스페이스 하나 두고 공백으로 나누어서 각 변수에 숫자를 저장한다.
        //String[] in = sc.next().split(" ");

//        int x = Integer.parseInt(in[0]);
//        int y = Integer.parseInt(in[1]);
//        int z = Integer.parseInt(in[2]);

        //gpt가 검수해준 코드. .next()말고 nextInt()쓰면 split안해도된다고한다.
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (1 > x || x > 6 || 1 > y || y > 6 || 1 > z || z > 6 ) {
            return;
        }

//        Map<String, Integer> values = new HashMap<>();
//        values.put("x", x);
//        values.put("y", y);
//        values.put("z", z);
//
//        String maxKey =  Collections.max(values.entrySet(), Map.Entry.comparingByValue()).getKey();
//        int max = Integer.parseInt(maxKey);

        /*3. 규칙에 따라 상금받을 준비.
        3개 숫자 동일 : 10(1000 +3? * 100)
        2개 숫자 동일 :   (1000 +2? * 100)
        그외         : max(?) * 100
         */

//        int equals = 0;
//        if (x == y && x == z) {
//            equals = 3;
//        }
//        else if (x == y || x == z || y == z) {
//            equals = 2;
//        }
//        else{
//            return;
//        }
//
//        int reward = switch (equals) {
//            case 3 ->(10000 + 3 * x * 1000);
//            case 2 -> (1000 + 2 * x * 100);
//            case 0 -> max * 100;
//            default -> 0;
//        };


// gpt가 검수해준 코드
        int reward;
        if (x == y && x == z) {
            // 세 숫자가 모두 같은 경우
            reward = 10000 + x * 1000;
        } else if (x == y || x == z) {
            // x와 y 또는 x와 z가 같은 경우
            reward = 1000 + x * 100;
        } else if (y == z) {
            // y와 z가 같은 경우
            reward = 1000 + y * 100;
        } else {
            // 모든 숫자가 다른 경우
            int max = Math.max(x, Math.max(y, z));
            reward = max * 100;
        }
        System.out.println(reward);
    }
}