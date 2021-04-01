package baekjoon;

import javax.swing.text.html.parser.Parser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backtracking14888 {

    static int n;
    static int num[];
    static long minN = 100000000, maxN = -100000000;

    public static void main(String[] args) throws IOException {
        int op[];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        num = new int[n];

        for (int i = 0; i < n; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        op = new int[4];

        for (int i = 0; i < 4; i++){
            op[i] = Integer.parseInt(st.nextToken());
        }

        back(op, num[0], 0);
        System.out.println(maxN);
        System.out.println(minN);
    }

    public static void back(int[] op, long val, int cnt){
        if(cnt == n-1) { //남은 숫자가 없을때 가장 작은수와, 큰수 확인
            minN = Math.min(minN, val);
            maxN = Math.max(maxN, val);
            return;
        }

        if(op[0] > 0){
            op[0]--;
            back(op, val + num[cnt+1], cnt+1);
            op[0]++;
        }
        if(op[1] > 0){
            op[1]--;
            back(op, val - num[cnt+1], cnt+1);
            op[1]++;
        }
        if(op[2] > 0){
            op[2]--;
            back(op, val * num[cnt+1], cnt+1);
            op[2]++;
        }
        if(op[3] > 0){
            op[3]--;
            back(op, val / num[cnt+1], cnt+1);
            op[3]++;
        }

        return;
    }

}
