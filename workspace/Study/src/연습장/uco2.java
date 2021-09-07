package 연습장;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class uco2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();

		ArrayList[] dp = new ArrayList[M + 1];

		for (int i = 0; i < dp.length; i++) {
			dp[i] = new ArrayList<Integer>();
		}

		dp[1].add(1);
		dp[3].add(3);
		dp[4].add(1);
		dp[4].add(3);
		dp[5].add(5);
		dp[6].add(1);
		dp[6].add(5);
		dp[7].add(7);

		for (int i = 8; i <= M; i++) {

			// i -1
			ArrayList<Integer> buf1 = new ArrayList<Integer>();
			boolean c1 = true;
			if (!dp[i - 1].isEmpty()) {
				buf1.add(1);
				for (int j = 0; j < dp[i - 1].size(); j++) {
					if ((int) dp[i - 1].get(j) != 1) {
						buf1.add((int) dp[i - 1].get(j));
						
					}
					else {
						c1 = false;
						break;
					}
				}
			}

			// i - 3
			ArrayList<Integer> buf2 = new ArrayList<Integer>();
			boolean c2 = true;
			if (!dp[i - 3].isEmpty()) {
				buf2.add(3);
				for (int j = 0; j < dp[i - 3].size(); j++) {
					if ((int) dp[i - 3].get(j) != 3) {
						buf2.add((int) dp[i - 3].get(j));
					}
					else {
						c2 = false;
						break;
						
					}
				}
			}


			int size1 = 0;
			int size2 = 0;
			if (!buf1.isEmpty()) {
				if(!c1) size1 = 0;
				else size1 = buf1.size();
			}
			if (!buf2.isEmpty()) {
				if(!c2) size2 = 0;
				else size2 = buf2.size();
			}

			if (size1 == 0 && size2 == 0) {
			} else if (size1 <= size2) {
				for (int j = 0; j < buf2.size(); j++) {
					dp[i].add(buf2.get(j));
				}
			} else {
				for (int j = 0; j < buf1.size(); j++) {
					dp[i].add(buf1.get(j));
				}
			}
		}

		int[] result = new int[dp[M].size()];
		for (int j = 0; j < dp[M].size(); j++) {
			result[j] = (int)dp[M].get(j);
		}
		
		Arrays.sort(result);
		
	}
	

}
