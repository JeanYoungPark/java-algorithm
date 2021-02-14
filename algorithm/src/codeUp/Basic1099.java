package codeUp;

import java.util.Scanner;

public class Basic1099 {

	public static void main(String[] args) {
		int x = 1,y = 1;
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		if(arr[x][y] == 2) {
			arr[x][y] = 9;
		}else {
			arr[x][y] = 9;
			while (true) {
				if(arr[x][y+1] == 0) { //오른쪽으로 이동 먼저 처리
					arr[x][y+1] = 9;
					y += 1;
				}else  if(arr[x][y+1] == 2){ //오른쪽으로 이동 먼저 처리
					arr[x][y+1] = 9;
					break;
				}else if(arr[x+1][y] == 0) { //아래쪽으로 이동 처리
					arr[x+1][y] = 9;
					x += 1;
				}else if (arr[x+1][y] == 2){
					arr[x+1][y] = 9;
					break;
				}else break;
			}
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
