package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

    static int zero, one;
    static int[] arr = new int[41];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T, n;
        T = Integer.parseInt(br.readLine());

        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i < 41; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for (int i = 0; i < T; i++){
            n = Integer.parseInt(br.readLine());
            if(n == 0){
                System.out.println(1 + " " + 0);
            }else if(n == 1){
                System.out.println(0 + " " + 1);
            }else{
                System.out.println(arr[n-1] + " " + arr[n]);
            }
        }
    }
}
