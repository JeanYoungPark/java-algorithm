package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Backtracking15649 {

	static int n,m;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static int num[];
	static boolean visited[];
	
	public static void main(String[] args) throws IOException {
		
		StringTokenizer a = new StringTokenizer(br.readLine());
		n = Integer.parseInt(a.nextToken());
		m = Integer.parseInt(a.nextToken());
		num = new int[n+1];
		visited = new boolean[n+1];
		
		back(0);
		bw.append(sb);
		bw.flush();
		bw.close();
	}
	
	static void back(int cnt) {
		if(cnt == m) {
			for(int i = 0; i < m; i++)
				sb.append(num[i]+" ");
			sb.append("\n");
			return;
		}
	
		for (int i = 1; i <= n; i++) {
			if(!visited[i]) {
				visited[i] = true;
				num[cnt] = i;
				back(cnt+1);
				visited[i] = false;
			}
		}
	}

}
