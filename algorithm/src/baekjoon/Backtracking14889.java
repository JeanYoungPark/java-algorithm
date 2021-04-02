package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backtracking14889 {
    static int n, minN = 100;
    static int s[][] = new int[20][20];
    static boolean chk[] = new boolean[20];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < n; j++){
                s[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        back(0, 0);
        System.out.print(minN);
    }

    public static void back(int cnt, int idx){

        if(cnt == n/2){
            int t1 = 0, t2 = 0;

            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    if(chk[i] == true && chk[j] == true) t1 += s[i][j];
                    else if(chk[i] == false && chk[j] == false) t2 += s[i][j];
                }
            }
            minN = Math.min(minN, Math.abs(t1 - t2));
            return;
        }

        for (int i = idx; i < n; i++){
            if(chk[i] == false ){
                chk[i] = true;
                back(cnt + 1, i + 1);
                chk[i] = false;
            }
        }

        return;
    }

}
