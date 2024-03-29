import java.util.Scanner;


/**
 * DP문제
 * https://velog.io/@imacoolgirlyo/12865%EB%B2%88-%ED%8F%89%EB%B2%94%ED%95%9C-%EB%B0%B0%EB%82%AD-86k4cgn35m
 * knapsack 문제로 유명
 * 
 * i : 선택한 물건
 * j : 최대 담을 수 있는 무게
 * @author 15com
 *
 */
public class 평범한배낭_12865 {
	
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		
		int[] W = new int[N];
		int[] V = new int[N];
		
		
		for (int i = 0; i < N; i++) {
			W[i] = sc.nextInt();
			V[i] = sc.nextInt();
		}
		
		
		int[][] dp = new int[N+1][K+1];
		int max = 0;
		for (int i = 1; i < N+1; i++) {
			for (int j = 1; j < K+1; j++) {
				if(j >= W[i-1]) { //현재 가방의 무게(j)가 현재의 위치 (i)의 무게보다 크거나 같을 때
					dp[i][j] = Math.max(V[i-1] + dp[i-1][j - W[i-1]], dp[i-1][j]); //현재 위치의 가치 + 이전 위치의 가치(현재 무게만큼 제외) vs 이전 배낭에서의 크기 --> 최대 담을 수 있는
				}
				else
					dp[i][j] = dp[i-1][j]; //담을 수 없다면 이전에 담을 수 있는 것이 가장 큰 개체
				
				max = Math.max(dp[i][j], max);
			}
		}
		
		System.out.println(max);
		
	}
}
