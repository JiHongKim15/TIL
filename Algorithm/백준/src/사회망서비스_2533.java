import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class 사회망서비스_2533 {
	static int[][] snsc;
	private static ArrayList<Integer>[] sns;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		sns = new ArrayList[N+1];
		snsc = new int[N + 1][2];
		
		for (int i = 0; i < N+1; i++) {
			sns[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < N - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a>b)
				sns[b].add(a);
			else
				sns[a].add(b);
		}

		// 1 = A, 2 = AX
		dfs(1);
		
	}

	private static void dfs(int st) {
		
	}

}
