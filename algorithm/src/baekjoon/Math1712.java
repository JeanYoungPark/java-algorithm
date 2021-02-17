package baekjoon;

import java.util.Scanner;

public class Math1712 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (c <= b)
			System.out.println(-1);
		else {
			System.out.println(a/(c-b) + 1);
		}
	}

}
