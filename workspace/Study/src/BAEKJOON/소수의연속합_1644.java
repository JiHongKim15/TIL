package BAEKJOON;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class 소수의연속합_1644 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 2; i <= N; i++) {
			hs.add(i);
		}
		
		for(int i=2; i*i<=N; i++) {
            for(int j=i*i; j<=N; j+=i) {
            	hs.remove(j);
            }
        }
		
		
		int result = 0;
		
		
		int[] arr = new int[hs.size()];
		
		int j = 0;
		for(Integer i : hs) {
			arr[j++] = i;
		}
		
		Arrays.sort(arr);
		int sum = 0;
		int left = 0;
		int right= 0;
		
		while(right >= left && right <arr.length && left<arr.length) {
			sum = sum + arr[right++];
			if(sum >N) {
				while(sum > N){
					sum -= arr[left];
					left++;
				}
			}
			if(sum ==N) {
				result++;
			}
		}
		
		System.out.println(result);
		
		
	}
}
