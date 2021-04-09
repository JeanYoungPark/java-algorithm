package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Dynamic1463 {
    static int d[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        d = new int[n+1];

        for(int i=2; i<=n; i++) {
            d[i] = d[i-1]+1; //n이 나누어떨어지는 것과 관계없는 n-1을 일단 d[i]에 넣어둔다.
            if(i%2 == 0) d[i] = Math.min(d[i/2]+1, d[i]); //d[i/2] = d[i/2]까지의 최소값 + *2를 한 d[i]로 이동하기위한 움직임(1)
            if(i%3 == 0) d[i] = Math.min(d[i/3]+1, d[i]);
        }
        System.out.print(d[n]);
    }
}
