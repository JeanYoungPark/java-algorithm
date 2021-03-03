package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Recursion2447 {

	public static void main(String[] args) {
		int n ;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		char[][] arr = new char[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(arr[i], ' ');
		}
		
		factorial(arr, n, 0, 0);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void factorial(char[][] arr, int n, int x, int y) {
		if(n == 1) {
			arr[x][y] = '*';
			return;
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(!(i == 1 && j == 1)) {
					factorial(arr, n/3, x+i*(n/3), y+j*(n/3)); //¸Å¿ì Çò±ò¸²...
				}
			}
		}
	}

}
