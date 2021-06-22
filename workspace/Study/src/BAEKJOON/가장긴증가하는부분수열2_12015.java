package BAEKJOON;

import java.util.ArrayList;
import java.util.Scanner;

public class 가장긴증가하는부분수열2_12015 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		ArrayList<Integer> rs = new ArrayList<>();
		rs.add(arr[0]);
		for (int i =1 ; i < arr.length; i++) {
			int lower = lowerBound(rs, 0, rs.size(), arr[i]);
			if(rs.size() <= lower) rs.add(arr[i]);
			else rs.set(lower, arr[i]);
		}
		
		System.out.println(rs.size());
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
