package baekjoon;

import java.util.Scanner;

public class Recursion10870 {

	public static void main(String[] args) {
		int n ;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(factorial(n));
	}
	
	public static int factorial(int n) {
		if(n == 0) return 0;
		else if(n == 1 || n == 2) return 1;
		return factorial(n-1)+factorial(n-2);
	}

}
