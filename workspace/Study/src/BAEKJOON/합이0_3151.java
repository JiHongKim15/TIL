package BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class гуюл0_3151 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int[] minus = new int[10001];
		int[] plus = new int[10001];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]>=0)plus[arr[i]]++;
			else minus[Math.abs(arr[i])]++;
			
		}
		
		int result = 0;
		
		Arrays.sort(arr);
		
		int p = 0;
		for (int i = 0; arr[i] < 0; i++) {
			int sum = arr[i];
			minus[Math.abs(arr[i])]--;
			for (int j = arr.length-1; arr[j] >= 0; j--) {
				sum += arr[j];
				plus[arr[j]]--;
				if(sum >= 0) {
//					if(-sum < arr[i] && minus[sum] > 0) result++;
//					if(-sum == arr[i] && minus[sum] > 0) p++;
					
					for (int k = i+1; arr[k] <= -sum; k++) {
						if(minus[Math.abs(arr[k])] > 0 && sum + arr[k] == 0) result++;
					}
				}
				else {
					for (int k = j-1; arr[k] >= -sum; k--) {
						if(plus[arr[k]] > 0 && sum + arr[k] == 0) result++;
					}
//					if(Math.abs(sum) > arr[j] && plus[Math.abs(sum)] > 0) result++;
//					if(Math.abs(sum) == arr[j] && plus[Math.abs(sum)] > 0) p++;
				}
				plus[arr[j]]++;
				sum -= arr[j];
			}
			
		}
		
		System.out.println(result + p/2);
	}
}
