package BAEKJOON;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 두배열의합_2143 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N = sc.nextInt();
		int A[] = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		int M = sc.nextInt();
		int B[] = new int[M];

		for (int i = 0; i < M; i++) {
			B[i] = sc.nextInt();
		}

		int ans = 0;

		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			arr.add(A[i]);
			int sum = A[i];

			for (int j = i + 1; j < N; j++) {
				sum += A[j];
				arr.add(sum);
			}
		}

		ArrayList<Integer> brr = new ArrayList<>();

		for (int i = 0; i < M; i++) {
			brr.add(B[i]);
			int sum = B[i];

			for (int j = i + 1; j < M; j++) {
				sum += B[j];
				brr.add(sum);
			}
		}

		Collections.sort(arr);
		Collections.sort(brr);

		int left = 0;
		int right = brr.size() -1;

		
		// �ߺ�ó��
		while (true) {
			if (left == arr.size() || right < 0)
				break;

			int sum = arr.get(left) + brr.get(right);
			if (sum == T) {
				ans++;
				if(left == arr.size()-1) right--;
				else left++;
			}
			else if (sum < T)
				left++;
			else
				right--;
		}
		
		System.out.println(ans);

	}
}
