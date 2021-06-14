package BAEKJOON;

import java.util.HashMap;
import java.util.Scanner;

public class »∏¿¸√ π‰_2531 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int d = sc.nextInt();
		int k = sc.nextInt();
		int c = sc.nextInt();

		int[] sushi = new int[N];

		for (int i = 0; i < N; i++) {
			sushi[i] = sc.nextInt();
		}

		int result = 0;
		HashMap<Integer, Integer> hs = new HashMap<>();
		hs.put(c, 1);
		for (int i = 0; i < k; i++) {
			if (hs.containsKey(sushi[i])) {
				hs.put(sushi[i], hs.get(sushi[i]) + 1);
			} else
				hs.put(sushi[i], 1);
		}

		result = Math.max(result, hs.size());
		for (int i = 1; i < sushi.length; i++) {
			if (hs.get(sushi[i - 1])-1 == 0)
				hs.remove(sushi[i - 1]);
			else
				hs.put(sushi[i - 1], hs.get(sushi[i - 1]) - 1);
			
			if(i+k-1>=N && hs.containsKey(sushi[i+k-1-N])) {
				hs.put(sushi[i+k-1-N], hs.get(sushi[i+k-1-N])+1);
			}
			else if(i+k-1>=N) {
				hs.put(sushi[i+k-1-N], 1);
			}
			else if(i+k-1 < N && hs.containsKey(sushi[i+k-1])) {
				hs.put(sushi[i+k-1], hs.get(sushi[i+k-1])+1);
			}
			else if(i+k-1 <N)
				hs.put(sushi[i+k-1], 1);
			
			result = Math.max(result, hs.size());
		}
		
		


		System.out.println(result);
	}
}