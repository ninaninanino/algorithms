
import lombok.extern.slf4j.Slf4j;

import java.io.*;

@Slf4j
public class baekjoon2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        if (1> t || t >100) return;

        for (int i = 0; i < t ; i++) {
            for (int j = i+1 ; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        br.close(); bw.flush(); bw.close();
    }
}