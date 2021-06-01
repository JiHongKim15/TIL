package BAEKJOON;

import java.util.ArrayList;
import java.util.Scanner;

public class 합이0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		// 2 -5 2 3 -4 7 -4 0 1 -6
		int[] arr = new int[N];

		ArrayList<Integer> minus = new ArrayList<>();
		ArrayList<Integer> plus = new ArrayList<>();

		long zero = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();

			if(arr[i] == 0) {
				zero++;
			}
			else if (arr[i] > 0)
				plus.add(arr[i]);
			else
				minus.add(-arr[i]);

		}

		long result = 0;

		long[] plus2 = new long[20001];
		long[] minus2 = new long[20001];

		// 양수 두개로 만들어진 배열
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
		
		if(zero>= 3) {
		//	zero!/(zero-3)! * 3!
		// zero * zero-1 * zero-2 / 6
			result += (zero * (zero-1) * (zero-2) )/6;
			
		}
		
		if(zero>=1) {
			for (int i = 0; i < plus.size(); i++) {
				
				for (int j = 0; j < minus.size(); j++) {
//					System.out.println((int)plus.get(i) == (int)minus.get(j));
					if((int)plus.get(i) == (int)minus.get(j)) {
						result+= zero;
					}
				}
				
			}
		}
		
		
		System.out.print(result);

	}
}
