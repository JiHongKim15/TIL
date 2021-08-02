package BAEKJOON;

import java.util.ArrayList;
import java.util.Scanner;

public class 주식_12014 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {

			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] arr = new int[N];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}

			ArrayList<Integer> rs = new ArrayList<>();
			rs.add(arr[0]);
			for (int i = 1; i < arr.length; i++) {
				int lower = lowerBound(rs, 0, rs.size(), arr[i]);
				if (rs.size() <= lower)
					rs.add(arr[i]);
				else
					rs.set(lower, arr[i]);
			}

			System.out.println("Case #" + t);
			if (K <= rs.size())
				System.out.println(1);
			else
				System.out.println(0);
		}
	}

	public static int lowerBound(ArrayList<Integer> arr, int left, int right, int key) {
		int mid = 0;
		while (left < right) {
			mid = (left + right) / 2;
			if (arr.get(mid) < key)
				left = mid + 1;
			else
				right = mid;
		}
		return right;
	}
}
