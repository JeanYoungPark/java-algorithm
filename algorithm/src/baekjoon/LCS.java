package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCS {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toCharArray();
        char[] b = br.readLine().toCharArray();

        int arr[][] = new int[a.length+1][b.length+1];

        for (int i = 1; i <= a.length; i++){
            for (int j = 1; j <= b.length; j++){
                //대각선 위의 값에서 +1
                if(a[i-1] == b[j-1]) arr[i][j] = arr[i - 1][j - 1]+1;
                else arr[i][j] = Math.max(arr[i - 1][j], arr[i][j - 1]);
                //없다면 전 행과 전 열 중 큰 수로 택
            }
        }

        System.out.print(arr[a.length][b.length]);
    }
}
