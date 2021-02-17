package baekjoon;

import java.util.Scanner;

public class Recursion10872 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(factorial(n));
	}
	
	public static int factorial(int n) {
		if(n > 1) return factorial(n-1)*n;
		else return 1; // 0과 1은 1로 출력된다.
	}
}
