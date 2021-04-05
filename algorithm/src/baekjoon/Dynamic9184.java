package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dynamic9184 {

    static int[][][] arr = new int[21][21][21];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a,b,c;
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            if(a == -1 && b == -1 && c == -1) break;

            sb.append("w("+a+", "+b+", "+c+") = "+ dp(a,b,c)+"\n");
        }
        System.out.print(sb);

    }

    public static int dp(int a, int b, int c){
        if(a >= 0 && b >= 0 && c >= 0 && a < 21 && b < 21 && c < 21 && arr[a][b][c] != 0) return arr[a][b][c];

        if (a <= 0 || b <= 0 || c <= 0) return 1;

        if(a > 20 || b > 20 || c > 20) return arr[20][20][20] = dp(20, 20, 20);

        if (a < b && b < c) return arr[a][b][c] = dp(a, b, c-1) + dp(a, b-1, c-1) - dp(a, b-1, c);

       return arr[a][b][c]= dp(a-1, b, c) + dp(a-1, b-1, c) + dp(a-1, b, c-1) - dp(a-1, b-1, c-1);
    }

}
