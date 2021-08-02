package BAEKJOON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 합이0_3151 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		// 2 -5 2 3 -4 7 -4 0 1 -6
		int[] arr = new int[N];

//		int[] plus = new int[N];
//		int[] minus = new int[N];
//		int p = 0;
//		int m = 0;
//		
//		long zero = 0;
//		for (int i = 0; i < N; i++) {
//			arr[i] = sc.nextInt();
//
//			if (arr[i] == 0) {
//				zero++;
//			} else if (arr[i] > 0)
//				plus[p++] = arr[i];
//			else
//				minus[m++] = -arr[i];
//
//		}
//
//		long result = 0;
//
//		long[] plus2 = new long[20001];
//		long[] minus2 = new long[20001];
//
//		// ��� �ΰ��� ������� �迭
//		// 0 1 2 2 3 7
//
//		for (int i = 0; i < p; i++) {
//			for (int j = i + 1; j < p; j++) {
//				plus2[plus[i] + plus[j]]++;
//			}
//		}
//		for (int i = 0; i < m; i++) {
//			result += plus2[minus[i]];
//		}
//
//		for (int i = 0; i < m; i++) {
//			for (int j = i + 1; j < m; j++) {
//				minus2[minus[i] + minus[j]]++;
//			}
//		}
//		for (int i = 0; i < p; i++) {
//			result += minus2[plus[i]];
//		}
//
//		if (zero >= 3) {
//			// zero!/(zero-3)! * 3!
//			// zero * zero-1 * zero-2 / 6
//			result += (zero * (zero - 1) * (zero - 2)) / 6;
//
//		}
//
//		if (zero >= 1) {
//			for (int i = 0; i < p; i++) {
//				for (int j = 0; j < m; j++) {
//					System.out.println(plus[i] == minus[j]);
//					if (plus[i] == minus[j]) {
//						result += zero;
//					}
//				}
//
//			}
//		}
		
		
		ArrayList<Integer> minus = new ArrayList<>();
		ArrayList<Integer> plus = new ArrayList<>();

		long zero = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] == 0) {
				zero++;
			} else if (arr[i] > 0)
				plus.add(arr[i]);
			else
				minus.add(-arr[i]);

		}

		long result = 0;

		long[] plus2 = new long[20001];
		long[] minus2 = new long[20001];

		// ��� �ΰ��� ������� �迭
		// 0 1 2 2 3 7

		for (int i = 0; i < plus.size(); i++) {
			for (int j = i + 1; j < plus.size(); j++) {
				plus2[plus.get(i) + plus.get(j)]++;
			}
		}
		for (int i = 0; i < minus.size(); i++) {
			result += plus2[minus.get(i)];
		}

		for (int i = 0; i < minus.size(); i++) {
			for (int j = i + 1; j < minus.size(); j++) {
				minus2[minus.get(i) + minus.get(j)]++;
			}
		}
		for (int i = 0; i < plus.size(); i++) {
			result += minus2[plus.get(i)];
		}

		if (zero >= 3) {
			// zero!/(zero-3)! * 3!
			// zero * zero-1 * zero-2 / 6
			result += (zero * (zero - 1) * (zero - 2)) / 6;

		}

		if (zero >= 1) {
			for (int i = 0; i < plus.size(); i++) {
				for (int j = 0; j < minus.size(); j++) {
					System.out.println(plus.get(i).equals(minus.get(j)));
					if ((int) plus.get(i) == (int) minus.get(j)) {
						result += zero;
					}
				}

			}
		}

		System.out.print(result);
	}
}
