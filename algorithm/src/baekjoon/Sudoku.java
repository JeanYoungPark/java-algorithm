package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Sudoku {

    static int arr[][];

    public static void main(String[] arg)  throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new int[9][9];

        for (int i = 0; i < 9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < 9; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        back(0, 0);
    }

    static void back(int h, int w){
        if(w == 9){
            back(h+1, 0);
            return;
        }

        if(h == 9){
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i< 9; i++){
                for (int j = 0; j < 9; j++){
                    sb.append(arr[i][j]).append(' ');
                }
                sb.append('\n');
            }

            System.out.println(sb);
            System.exit(0);
        }

        if(arr[h][w] == 0){
            for (int i = 1; i < 10; i ++){
                if(chk(h,w,i)){
                    arr[h][w] = i;
                    back(h,w+1);
                }
            }

            arr[h][w] = 0;
            return;
        }

        back(h, w+1); //빈칸이 아닌경우
    }
    public static boolean chk(int h, int w, int num){
        int sti, stj;

        sti = h/3*3 ;
        stj = w/3*3;

        for (int i = 0; i < 9; i++){
            if(arr[h][i] == num) return false; //가로줄에 같은 숫자가 있다면
            else if( arr[i][w] == num ) return false; //세로줄에 같은 숫자가 있다면
        }

        for (int i = sti; i < sti+3; i++){ //3x3 영역 같은 숫자 확인
            for (int j = stj; j < stj+3; j++){
                if(arr[i][j] == num) return false;
            }
        }

        return true;
    }


}
