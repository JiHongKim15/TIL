import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//바이너리서치
public class 수찾기_1920 {
	 private static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =  sc.nextInt();
		arr= new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int M = sc.nextInt();
		
		for (int i = 0; i < M; i++) {
			int num = sc.nextInt();
			System.out.println(bs(0, N-1, num));
		}
	}

	private static int bs(int low, int high, int num) {
		
		if(low > high)
			return 0;
		
		int mid = (low + high) / 2;
		
		if(arr[mid] == num)
			return 1;
		
		if(arr[mid] > num)
			return bs(low, mid-1, num);

		return bs(mid+1, high, num);
	
	}
	
}
