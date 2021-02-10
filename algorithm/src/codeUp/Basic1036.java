package codeUp;

import java.util.Scanner;

public class Basic1036 {

	public static void main(String[] args) {
		char a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextLine().charAt(0); //char 받는 방법
		int b = (int)a; //c++처럼 숫자로 인지하지 않는다. 그래서 형변화 필요 
		System.out.println(b);
	}

}
