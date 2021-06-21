package BAEKJOON;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 줄서기_14864 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		
		//�� �ڿ� �տ� ����� �ִ� �� ����
		int[] back = new int[N+1];
		int[] front = new int[N+1];
		
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			back[a]++;
			front[b]++;
		}
		
		boolean[] check = new boolean[N+1];
		int[] result = new int[N+1];
		for (int i = 1; i < N+1; i++) {
			result[i] = back[i] + i - front[i];
			
			if(check[result[i]]) {
				System.out.println(-1);
				return;
			}
			check[result[i]] = true;
			
		}

		for (int j = 1; j < result.length; j++) {
			System.out.print(result[j] + " ");
		}
		
		
		/*
		ArrayList[] std = new ArrayList[N + 1];

		for (int i = 0; i < std.length; i++) {
			std[i] = new ArrayList<Integer>();
		}
		
		int[] check = new int[N + 1];
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			std[b].add(a);
			check[a]++;
		}

		PriorityQueue<Integer> q = new PriorityQueue<>();
		for (int i = 1; i < check.length; i++) {
			if (check[i] == 0) {
				q.add(i);
			}
		}

		int[] result = new int[N + 1];
		int cnt = 1;
		while (!q.isEmpty()) {

			int buf = q.poll();
			result[buf] = cnt++;
			for (int i = 0; i < std[buf].size(); i++) {
				if (check[(int) std[buf].get(i)] != 0) {
					check[(int) std[buf].get(i)]--;

					if (check[(int) std[buf].get(i)] == 0)
						q.add((int) std[buf].get(i));
				}
			}
		}

		if (cnt < N) {
			System.out.println(-1);
		} else {
			for (int i = 1; i < result.length; i++) {
				for (int j = i + 1; j < result.length; j++) {
					if (result[i] > result[j]) {
						if (!std[j].contains(i)) {
							System.out.println(-1);
							return;
						}
					}
				}
			}
			for (int i = 1; i < result.length; i++) {
				System.out.print(result[i] + " ");
			}
		}
*/
	}
}
