package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dynamic2579 {
    static int arr[] = new int[301];
    static int ans[] = new int[301];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i < n+1; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        ans[0] = arr[0];
        ans[1] = Math.max(arr[1],arr[0]+arr[1]);
        ans[2] = Math.max(arr[0]+arr[2],arr[1]+arr[2]);

        for (int i = 3; i < n; i++){
            ans[i] = Math.max(ans[i - 2] + arr[i], ans[i - 3] + arr[i - 1] + arr[i]);
        }

        System.out.print(ans[n-1]);
    }
}
