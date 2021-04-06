package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dynamic9461 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int n;
        long arr[] = new long[101];
        arr[1] = arr[2] = arr[3] = 1;

        for (int i = 3; i < 101; i++){
            arr[i] = arr[i - 2] + arr[i - 3];
        }

        for (int i = 0; i < T; i++){
            n = Integer.parseInt(br.readLine());
            st.append(arr[n] + "\n");
        }

        System.out.print(st);
    }
}
