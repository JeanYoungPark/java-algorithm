package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Recursion11729 {
	
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Scanner 수행시간 문제로 버퍼리더 사용
		int n = Integer.parseInt(br.readLine());

		bw.write((int) (Math.pow(2, n) - 1) + "\n");
		factorial(1, 2, 3, n);

		bw.flush();
		bw.close();
	}
	
	public static void factorial(int from, int by, int to, int n) throws IOException{

		if (n == 1) {
			bw.write(from + " " + to + "\n");
			return;
		}

		//n-1개를 A에서 B로 이동
		factorial(from, to, by, n - 1);
		
		//1개를 A에서 C로 이동
		bw.write(from+" "+to+"\n");
		
		//n-1개를 B에서 C로 이동
		factorial(by, from, to, n-1);
	}

}
