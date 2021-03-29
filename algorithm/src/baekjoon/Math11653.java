package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math11653 {

    public static void main(String[] args) throws IOException {
        int n, i=2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());

        if( n > 1){
            while (n>1){
                if(n%i == 0) {
                    sb.append(i).append('\n');
                    n /= i;
                    i = 2;
                }else i++;
            }
        }
        System.out.print(sb);
    }
}
