import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

@Slf4j
public class baekjoon10813 {
    /**
     * //https://www.acmicpc.net/problem/10813
     * 문제
     * 도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다. 바구니에는 공이 1개씩 들어있고, 처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있다.
     *
     * 도현이는 앞으로 M번 공을 바꾸려고 한다. 도현이는 공을 바꿀 바구니 2개를 선택하고, 두 바구니에 들어있는 공을 서로 교환한다.
     *
     * 공을 어떻게 바꿀지가 주어졌을 때, M번 공을 바꾼 이후에 각 바구니에 어떤 공이 들어있는지 구하는 프로그램을 작성하시오.
     *
     * 입력
     * 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
     *
     * 둘째 줄부터 M개의 줄에 걸쳐서 공을 교환할 방법이 주어진다. 각 방법은 두 정수 i j로 이루어져 있으며, i번 바구니와 j번 바구니에 들어있는 공을 교환한다는 뜻이다. (1 ≤ i ≤ j ≤ N)
     *
     * 도현이는 입력으로 주어진 순서대로 공을 교환한다.
     *
     * 출력
     * 1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다.
     *
     *              [1 2 3 4 5]
     *         (1,2) 2 1 - - -
     *         (3,4) - - 4 3 -
     *         (1,4) 3 - - 2 -
     *         (2,2) - 1 - - -
     *         (결과) 3 1 4 2 5
     *
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        //첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
        //둘째 줄부터 M개의 줄에 걸쳐서 공을 교환할 방법이 주어진다.
        // 각 방법은 두 정수 i j로 이루어져 있으며,
        // i번 바구니와 j번 바구니에 들어있는 공을 교환한다는 뜻이다. (1 ≤ i ≤ j ≤ N)
        //도현이는 입력으로 주어진 순서대로 공을 교환한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        String[] t = br.readLine().split(" ");
//        1. 첫번째줄로 배열의 크기(바구니수, n)개와 비교할 회차(m)를 찾아낸다. 이걸로 for문 돌림

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        if (1>n || n>100 || 1>m  || m>100) return;

        // 바구니에 들어있는 공 번호 배열 저장 초기 세팅
        int[] balls = new int[n]; // 이게 핵심이야 잘 배워두자!!!

        for (int i = 0; i< n; i++){
            balls[i] = i+1; //초기에는 배열 인덱스 값과 배열 밸류 값이 동일함.
        }
        log.info("///////// balls 초기값 ////////// ");
        log.info(Arrays.toString(balls));

        //2. m번 만큼 돌림
        for (int i = 0 ; i < m ; i++) {
            // 위에 인풋이 문자열 배열이라고 선언해서 또 선언할필요없음
            input = br.readLine().split(" ");
            log.info(Arrays.toString(input));

            // 위치
            int a = Integer.parseInt(input[0]) - 1;
            int b = Integer.parseInt(input[1]) - 1;

            log.info("iteration : " + i +" / " + m);
            log.info(String.valueOf(a));
            log.info(String.valueOf(b));
            log.info("///////// iteration ////////// ");

            if (0 > a || a > b || b > n)  return ;

            //밸류 교환함
            int temp = balls[a];
            balls[a] = balls[b];
            balls[b] = temp;

            log.info("///////// balls @ iteration"+i+" ////////// ");
            log.info(Arrays.toString(balls));
        }

//        for (int i = 0; i < n; i++) {
//        bw.write(balls[i] + " ");
//        }
        for (int i = 0; i < n; i++) {
            System.out.print(balls[i] + " ");
        }

//        bw.flush();

        br.close();
//        bw.close();
    }
}