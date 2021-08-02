package BAEKJOON;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class 패션왕신해빈_9375 {
	static HashMap<String, Integer> hm;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int result = 1;
			hm = new HashMap<>();
			for (int i = 0; i < N; i++) {
				sc.next();
				String kinds = sc.next();
				// A -> 2
				// B -> 3
				if(hm.containsKey(kinds))	hm.put(kinds, hm.get(kinds)+1);
				else hm.put(kinds, 1);
			}
			
			
			Object[] key = hm.keySet().toArray();
			
			for (int i = 0; i < key.length; i++) {
				result *= hm.get(key[i])+1;
			}
			
			//A -> 2 (A안입는경우, A-1, A-2) -> 3개
			
			//B -> 3 (B안입은경우, B-1, B-2, B-3) -> 4개
			
			// A B --> 1개 

			System.out.println(result-1);
			
			
			
//			2^n * n
//			for (int i = 0; i < (1<<key.length); i++) {
//				int cnt = 1;
//				for (int j = 0; j < key.length; j++) {
//					if((i & 1 << j) != 0)
//					{
//						cnt *= hm.get(key[j]);
//					}
//				}
//				result += cnt;
//			}
			
		}
	}

	
}
