import java.io.*;

class baekjoon11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int repeat = Integer.parseInt(br.readLine());
        
        for (int i = 1 ; i < repeat+1 ; i++){
            String[] inputs = br.readLine().split(" ");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            int v_plus = a+b;
            
            System.out.println("Case #"+ i + ": "+ v_plus);
        }
        br.close();
        bw.flush();
        bw.close();

    }
}