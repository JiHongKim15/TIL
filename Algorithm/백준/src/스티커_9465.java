import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// dp
public class 스티커_9465 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] dr = {1, 1, -1, -1};
		int[] dc = {1, -1, 1, -1};
		for (int tc = 0; tc < T; tc++) {
			int n = sc.nextInt();
			int[][] sticky = new int[2][n+1];
			
			for (int i = 0; i < 2; i++) {
				for (int j = 1; j < n+1; j++) {
					sticky[i][j] = sc.nextInt();
				}
			}
			
			int[][] dp = new int[2][n+1];
			dp[0][1] = sticky[0][1];
			dp[1][1] = sticky[1][1];
			
			for (int i = 2; i < n+1; i++) {
				dp[0][i] = Math.max(dp[1][i-2], dp[1][i-1]) +sticky[0][i];
				dp[1][i] = Math.max(dp[0][i-2], dp[0][i-1]) + sticky[1][i];
			}
			
			System.out.println(Math.max(dp[0][n], dp[1][n]));
		}
	}
}
