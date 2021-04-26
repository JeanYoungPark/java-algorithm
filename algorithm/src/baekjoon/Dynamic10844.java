package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dynamic10844 {
    static int arr[][] = new int[101][10];
    public static void main(String[] args) throws IOException{
        int N, sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < 10; i++){
            arr[1][i] = 1;
        }

        for (int i = 2; i <= N; i++){
            for (int j = 0; j < 10; j++){
                if(j == 0) arr[i][0] = arr[i - 1][1];
                else if (j == 9) arr[i][9] = arr[i - 1][8];
                else arr[i][j] = (arr[i - 1][j - 1] + arr[i - 1][j + 1])%1000000000; //수가 커서 매번 나눠줌
            }
        }

        for (int i = 1; i < 10; i++){
            sum = (sum+arr[N][i])%1000000000; //수가 커서 매번 나눠줌
        }

        System.out.print(sum%1000000000); //수가 커서 매번 나눠줌
    }
}
