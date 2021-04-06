package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dynamic1904 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[3];
        arr[0] = 1;
        arr[1] = 2;

        if( N == 1){
            System.out.print(1);
        }else if(N == 2){
            System.out.print(2);
        }else {
            for (int i = 3; i < N+1; i++){
                arr[2] = (arr[0] + arr[1]) % 15746 ;
                arr[0] = arr[1];
                arr[1] = arr[2];
            }
            System.out.print(arr[2]);
        }
    }
}
