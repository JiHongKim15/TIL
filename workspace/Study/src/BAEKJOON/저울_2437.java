package BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class 저울_2437 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = 0;
		int[] arr = new int[N];
//		int[] check = new int[1000001];
		int[] check = new int[60];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			max += arr[i];
			check[arr[i]]++;
		}
		
		Arrays.sort(arr);
		
		for (int i = 1; i < max; i++) {
			if(check[i] > 0) {
				continue;
			}
			else {
				int[] dp = new int[N];
				dp[0] = arr[0];
				if(check[i-arr[0]] == 0 ) {
				for (int j = 1; arr[j] < i; j++) {
					if(check[i-arr[j]] > 0 || check[i-dp[j]] > 0) {
						check[i]++;
						break;
					}else {
						dp[j] += arr[j-1];
					}
				}
				}
				else {
					check[i]++;
				}
			}
		}
		
	}
}
