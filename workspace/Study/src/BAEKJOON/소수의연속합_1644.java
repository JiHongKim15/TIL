package BAEKJOON;

import java.util.ArrayList;
import java.util.Scanner;

public class 소수의연속합_1644 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		boolean[] check = new boolean[N + 1];

		for (int i = 2; i * i <= N; i++) {
			for (int j = i * i; j <= N; j += i) {
				check[j] = true;
			}
		}

		int result = 0;

		ArrayList<Integer> ll = new ArrayList<>();

		for (int i = 2; i <= N; i++) {
			if (!check[i]) {
				ll.add(i);
			}

		}

		int sum = 0;
		int left = 0;
		int right = 0;

		while (true) {

			if (sum >= N) {
				sum -= ll.get(left++);
			} else if (right == ll.size())
				break;
			else
				sum += ll.get(right++);
			if (sum == N) {
				result++;
			}
		}

		System.out.println(result);

	}
}
