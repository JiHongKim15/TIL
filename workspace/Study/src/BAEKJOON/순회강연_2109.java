package BAEKJOON;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class 순회강연_2109 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][2];

		for (int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}

	
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub

				if (o1[0] == o2[0]) {
					return o1[1] - o2[1];
				}

				return o2[0] - o1[0];
			}

		});

		int result = 0;
		
		TreeSet<Integer> set = new TreeSet<>();
		
		for (int i = 1; i < 10001; i++) {
			set.add(i);
		}
		
		
		// O(nlogn)
		for (int j = 0; j < arr.length; j++) {
			// ����Ʈ��
			
			// ���Ǹ� �� �� �ִ� ��¥
			// lower + 1 ==> ����
			Integer a = set.lower(arr[j][1]+1);
			
			if(a == null)
				continue;
			
			
			result += arr[j][0];
			set.remove(a);
		}

		System.out.println(result);

	}
	
	
}
