package codeUp;

import java.util.Scanner;

public class Basic1098 {

	public static void main(String[] args) {
		int h,w,n,l,d,x,y;
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		n = sc.nextInt();
		int[][] arr = new int[w][h];
		
		for (int i = 0; i < n; i++) {
			l = sc.nextInt();
			d = sc.nextInt();
			x = sc.nextInt()-1;//좌표값을 1부터 받는다. 본래 좌표는 0부터 시작함으로 1빼준다.
			y = sc.nextInt()-1;
			
			if(d == 0) { //가로로 이동
				for (int j = y; j < y+l; j++) {
					arr[x][j] = 1;
				}
			}else { //세로로 이동
				for (int j = x; j < x+l; j++) {
					arr[j][y] = 1;
				}
			}
		}
		
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {
				System.out.printf(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
