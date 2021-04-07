package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Dynamic1932 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long arr[][] = new long[501][501];
        long cost[][] = new long[501][501];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < i+1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        cost[0][0] = arr[0][0];

        for (int i = 1; i < n; i++) { //뒤에서부터 하면 속도가 더 빠르다.
            for (int j = 0; j < i+1; j++){
                if(j == 0) cost[i][j] = arr[i][j] + cost[i-1][j];
                else if(j == i) cost[i][j] = arr[i][j] + cost[i-1][j-1];
                else cost[i][j] = arr[i][j] + Math.max(cost[i-1][j], cost[i-1][j-1]);
            }
        }
        Arrays.sort(cost[n-1]);
        System.out.print(cost[n-1][cost.length-1]);
    }
}
