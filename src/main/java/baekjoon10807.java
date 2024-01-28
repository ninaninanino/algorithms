import lombok.extern.slf4j.Slf4j;

import java.io.*;

@Slf4j
// 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
public class baekjoon10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //첫줄: 정수 개수 n (1<=n<=100)
        int n = Integer.parseInt(br.readLine());
        if (1 > n || n > 100) return;
//        log.info(String.valueOf(n));

        //두번째줄: 정수가 공백으로 구분 -100<= m <=100
        String[] inputs = br.readLine().split(" ");
//        log.info(Arrays.toString(inputs));

        //세번쨰줄: 찾으려고 하는 정수 v -100<= v <=100
        int v = Integer.parseInt(br.readLine());
        if (-100 > v || v >100 ) return;
//        log.info(String.valueOf(v));

        //첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.
        int v_cnt = 0;

        for (int i = 0 ; i < n ; i++){
            int m = Integer.parseInt(inputs[i]);

            if (-100 > m || m >100 ) return;

            if (m-v == 0 ) {
                v_cnt += 1;
            }
        }

        bw.write(String.valueOf(v_cnt));
//        log.info(String.valueOf(v_cnt));

        br.close();
        bw.flush();
        bw.close();
    }
}