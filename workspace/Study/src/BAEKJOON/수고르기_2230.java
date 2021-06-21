package BAEKJOON;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class 수고르기_2230 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] arr = new int[N];

		boolean zero = false;
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			int a = sc.nextInt();
			if (hs.contains(a))
				zero = true;
			hs.add(a);
			arr[i] = a;
		}

		if (zero && M == 0) {
			System.out.println(0);
			return;
		}

		Arrays.sort(arr);

		int left = 0;
		int min = Integer.MAX_VALUE;
		int right = 1;
		while (right >= left && right < N && left < N) {
			if (arr[right] - arr[left] >= M) {
				min = Math.min(min, arr[right]-arr[left]);
				left++;
			}
			else right++;
		}
		System.out.println(min);
	}
}
