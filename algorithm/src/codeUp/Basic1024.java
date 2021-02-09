package codeUp;

import java.util.Scanner;

public class Basic1024 {

	public static void main(String[] args) {
		String n;
		
		Scanner sc = new Scanner(System.in);
		n = sc.next();
		
		for(int i = 0; i < n.length(); i++) {
			System.out.println("'"+n.charAt(i)+"'");
		}
	}

}
