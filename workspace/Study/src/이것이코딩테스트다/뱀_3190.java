package 이것이코딩테스트다;
import java.util.Scanner;

/**
 * 백준
 * @author 15com
 *
 */
public class 뱀_3190 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N =sc.nextInt();
		int K = sc.nextInt();
		int[][] map = new int[N][N];
		
		for (int i = 0; i < K; i++) {
			map[sc.nextInt()][sc.nextInt()] = 1;
		}
		
		int L = sc.nextInt();
		
		String[][] XC = new String[L][2];
		
		for (int i = 0; i < L; i++) {
			XC[i][0] = sc.next()+1;
			XC[i][1] = sc.next()+1;
		}
		
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				
			}
		}
		
	}
}
