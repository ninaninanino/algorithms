import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/**
 * 10871번: X보다 작은 수
 * 문제
 * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
 * 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
 * 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다.
 * 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
 *
 * 출력
 * X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다.
 * X보다 작은 수는 적어도 하나 존재한다.
 *
 * https://www.acmicpc.net/problem/10871
 */

@Slf4j

public class baekjoon10871 {
    public static void main(String[] args) throws IOException {
        //1. 첫째줄에 n과 x가 주어진다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = br.readLine().split(" ");
        int N = Integer.parseInt(input1[0]);
        int X = Integer.parseInt(input1[1]);

        if (1>N || X >10000) return;

        //2. 둘째줄에 수열A를 이루는 정수 N개가 주어지고 모두 1~10000 이내에 있음
        /*둘째줄에 들어온 숫자를 배열에 담아야 할거고
        걔네가 하나하나 x보다 큰면 새로운 배열 output에 담고 아니면 안 담고
        마지막에 그 output을 프린트해야함
        */

        String[] input2 = br.readLine().split(" ");
        List<String> output = new ArrayList<>();

        for (String A : input2) {
                int k = Integer.parseInt(A);
                if (k < X) output.add(A);
        }
        System.out.println(String.join(" ", output));
    }
}