package codeUp;

import java.util.Scanner;

public class Basic1093 {

	public static void main(String[] args) {
		int n, num;
		int[] arr = new int[24];
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			num = sc.nextInt();
			arr[num]++;
		}
		
		for (int i = 1; i <= 23; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
