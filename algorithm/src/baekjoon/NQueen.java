package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NQueen {
    static int n, ans=0;
    static int arr[] = new int[15];
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        back(0);
        System.out.println(ans);
    }

    static boolean promising(int depth){
        for (int i = 0; i < depth; i++){ //앞선 퀸들과 대조해보기 위해 현재 퀸의 높이까지 반복
            //같은 열에 존재할 경우
            if(arr[i] == arr[depth]) return false;
                //대각선에 존재할 경우 : 앞서 둔 퀸과 비교하여 열의차와 행의 차가 일치 할 경우
            else if(Math.abs(arr[depth] - arr[i]) == (depth - i)) return false;
        }
        return true;
    }

    static void back(int depth) {

        if(depth == n) {
            ans++;
            return;
        }else {
            for (int i = 0; i < n; i++){
                arr[depth] = i; //(depth, i)로 생각하면 된다.
                if(promising(depth)) back(depth+1);
            }
        }

    }
}


