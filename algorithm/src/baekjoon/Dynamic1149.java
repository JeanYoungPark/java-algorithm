package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dynamic1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cost[][] = new int[1001][3];
        int d[][] = new int[1001][3];

        for (int i = 1; i < N+1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            cost[i][0] = Integer.parseInt(st.nextToken());
            cost[i][1] = Integer.parseInt(st.nextToken());
            cost[i][2] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < N+1; i++) {
            d[i][0] = cost[i][0] + Math.min(d[i - 1][1], d[i - 1][2]);
            d[i][1] = cost[i][1] + Math.min(d[i - 1][0], d[i - 1][2]);
            d[i][2] = cost[i][2] + Math.min(d[i - 1][0], d[i - 1][1]);
        }
        System.out.print(Math.min(d[N][0], Math.min(d[N][1], d[N][2])));
    }
}
