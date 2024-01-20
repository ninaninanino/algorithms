
import lombok.extern.slf4j.Slf4j;

import java.io.*;

@Slf4j
public class baekjoon10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String[] inputs = br.readLine().split(" ");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);

            if (a ==0 && b== 0) {
                break;
                }

            bw.write((a+b)+"\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}