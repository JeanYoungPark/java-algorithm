package codeUp;

import java.util.Scanner;

public class Basic1020 {
	public static void main(String[] arg) {
		String a;
		Scanner sc = new Scanner(System.in);
		a = sc.next();
		a = a.replaceAll("-", "");
		System.out.println(a);
	}
}
