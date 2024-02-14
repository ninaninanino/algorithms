import lombok.extern.slf4j.Slf4j;
import java.io.*;

@Slf4j
public class Main {
    /**
     * //https://www.acmicpc.net/problem/10813
     * @param args
     */
    public static void main(String[] args) throws IOException {
        //첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
        //둘째 줄부터 M개의 줄에 걸쳐서 공을 교환할 방법이 주어진다.
        // 각 방법은 두 정수 i j로 이루어져 있으며,
        // i번 바구니와 j번 바구니에 들어있는 공을 교환한다는 뜻이다. (1 ≤ i ≤ j ≤ N)
        //도현이는 입력으로 주어진 순서대로 공을 교환한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        String[] t = br.readLine().split(" ");
//        1. 첫번째줄로 배열의 크기(바구니수, n)개와 비교할 회차(m)를 찾아낸다. 이걸로 for문 돌림

        String[] l1 = br.readLine().split(" ");
        int n = Integer.parseInt(l1[0]);
        int m = Integer.parseInt(l1[1]);

        if (1>n || n>100 ||1>m || m>100) return;

        String[] output;
        // output = [ [0,1],
        //            [1,2],
        //            [2,3],
        //            [3,4]
        //            [n-1,n]
        //           ]

        for (int i = 0 ; i < m ; i++) {
            String[] inputs = br.readLine().split(" ");
            // 위치
            int ii = Integer.parseInt(inputs[0]);
            int jj = Integer.parseInt(inputs[1]);
            //밸류
            int i_val = Integer.parseInt(output[ii]);
            int j_val = Integer.parseInt(output[jj]);

            if (1 <= i_val && i_val <= j_val && j_val <= n) {

                i_val = Integer.parseInt(inputs[1]);
                j_val = Integer.parseInt(inputs[0]);


            }
        }
       [1 2 3 4 5]
        2 1 - - -
        - - 4 - -2 - 3 1 4 2 5

        br.close();
        bw.flush();
        bw.close();
    }
}