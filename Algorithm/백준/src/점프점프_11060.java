import java.util.Scanner;

public class 점프점프_11060 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] dp = new int[N];
		
		dp[0] = 1;
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			
			for (int j = 1; j <= num; j++) {
				if(i+j >= N) break;
				
				if(dp[i+j] == 0 || dp[i+j] > dp[i]+1)
					if(dp[i] != 0)
					dp[i+j] = dp[i]+1;
				
			}
			
		}
		
		if(dp[N-1] == 0)
			System.out.println(-1);
		else
			System.out.println(dp[N-1]-1);
		
		
	}
}
