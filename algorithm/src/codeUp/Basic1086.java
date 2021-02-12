package codeUp;

import java.util.Scanner;

public class Basic1086 {

	public static void main(String[] args) {
		long w,h,b;
		Scanner sc = new Scanner(System.in);
		w = sc.nextLong();
		h = sc.nextLong();
		b = sc.nextLong();
		double total = w*h*b;
		double ans = (total/8)/1024/1024; //8bit->1byte 
		System.out.format("%.2f MB",ans);//소수점 둘째자리까지
	}

}
