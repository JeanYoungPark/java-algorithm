package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dynamic11054 {
    static int arr[], r_dp[],l_dp[],ans = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        r_dp = new int[N];
        l_dp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            r_dp[i] = 1;
            for (int j = 0; j < N; j++) {
                if(arr[i] > arr[j] && r_dp[i] < r_dp[j] + 1){
                    r_dp[i] = r_dp[j]+1;
                }
            }
        } //왼쪽부터 오름차순

        for (int i = N-1; i >=0; i--) {
            l_dp[i] = 1;
            for (int j = N-1; j >= 0; j--) {
                if(arr[i] > arr[j] && l_dp[i] < l_dp[j] + 1){
                    l_dp[i] = l_dp[j]+1;
                }
            }
        } //오른쪽부터 오름차순

        for (int i = 0; i < N; i++) {
            //이건 나름의 공식인 듯
            ans = ans < r_dp[i] + l_dp[i] ? r_dp[i] + l_dp[i] : ans;
        }

        System.out.println(ans-1);
    }
}
