package BAEKJOON;
import java.util.Scanner;

public class 부분합_1806 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

//		int rs = Integer.MAX_VALUE;
//		for (int j = 0; j <= N; j++) {
//			for (int i = N; i >= 1; i--) {
//				if (i-j-1>= 0 && sum[i] - sum[i - j - 1] >= S) {
//					rs = Math.min(j, rs);
//					if (rs == Integer.MAX_VALUE)
//						System.out.println(0);
//					else
//						System.out.println(rs+1);
//
//					return;
//
//				}
//			}
//		}
		
		int rs = Integer.MAX_VALUE;
		int sum = 0;
		int left = 0, right = 0;
		
		/**
		 * 이진 탐색
		 */
		while(left <= right ) {
 			if(sum >= S) {
				rs = Math.min(rs, right-left);
				sum -= arr[left++];
			}
 			
 			else if(right >= N) break;
 			else{
 				sum += arr[right];
 				right++;
 			}
		}
		
		System.out.println(rs == Integer.MAX_VALUE ? 0 : rs);

	}

}
