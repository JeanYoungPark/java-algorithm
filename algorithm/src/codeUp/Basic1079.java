package codeUp;

import java.util.Scanner;

public class Basic1079 {

	public static void main(String[] args) {
		char a;
		Scanner sc = new Scanner(System.in);
		while (true) {
			a = sc.next().charAt(0);
			if(a == 'q') {
				System.out.println(a);
				break;
			}
			System.out.println(a);
		}
	}

}
