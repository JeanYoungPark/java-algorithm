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
			x = sc.nextInt()-1;//��ǥ���� 1���� �޴´�. ���� ��ǥ�� 0���� ���������� 1���ش�.
			y = sc.nextInt()-1;
			
			if(d == 0) { //���η� �̵�
				for (int j = y; j < y+l; j++) {
					arr[x][j] = 1;
				}
			}else { //���η� �̵�
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
