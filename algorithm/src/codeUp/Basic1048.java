package codeUp;

import java.util.Scanner;

public class Basic1048 {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		int c = (int)Math.pow(2, b);
		System.out.println(a*c);
	}

}
