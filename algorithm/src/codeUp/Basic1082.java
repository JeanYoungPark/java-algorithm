package codeUp;

import java.util.Scanner;

public class Basic1082 {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt(16); //16진수로 입력받음
		
		for (int i = 1; i < 16; i++) {
			System.out.printf("%X*%X=%X\n",a,i,a*i);
		}	
	}

}
