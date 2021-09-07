
import java.util.Scanner;

public class 꿍의우주여행_9501 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int D = sc.nextInt();
			int cnt = 0;
			
			int[] v = new int[N];
			int[] f = new int[N];
			int[] c = new int[N];
			
			for (int i = 0; i < N; i++) {
				v[i] = sc.nextInt();
				f[i] = sc.nextInt();
				c[i] = sc.nextInt();
				
				double time = (double) f[i]/ (double) c[i];
				double vector = (double) v[i] * time;
				if(vector >= D) {
					cnt++;
				}
				
			}
			
			System.out.println(cnt);
			
			
		}
	}
}
