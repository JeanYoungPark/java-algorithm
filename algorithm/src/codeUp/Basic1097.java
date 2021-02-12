package codeUp;

import java.util.Scanner;

public class Basic1097 {

	public static void main(String[] args) {
		int[][] arr = new int[19][19];
		int n,x,y;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				arr[i][j] = sc.nextInt(); 
			}
		}
		
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			x = sc.nextInt()-1;
			y = sc.nextInt()-1;
			for (int j = 0; j < 19; j++) { //입력된 가로줄을 뒤집는다
				if(arr[x][j] == 1) arr[x][j] = 0;
				else arr[x][j] = 1;
			}
			for (int j = 0; j < 19; j++) { //입력된 세로줄을 뒤집는다
				if(arr[j][y] == 1) arr[j][y] = 0;
				else arr[j][y] = 1;
			}
		}
		
		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.print("\n");
		}
	}

}
