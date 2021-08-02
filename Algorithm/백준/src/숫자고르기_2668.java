import java.util.Arrays;
import java.util.Scanner;

public class 숫자고르기_2668 {
	static boolean check[];
	static int max = 0;
	static int result[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			arr[i] = sc.nextInt();
		}

		check = new boolean[N + 1];
		result = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			if (!check[i])
				dfs(arr, i, i, 1, new int[N + 1]);
		}
		System.out.println(max);
		Arrays.sort(result);
		for (int i = 1; i < result.length; i++) {
			if(result[i] == 0)
				continue;
			System.out.println(result[i]);
		}
	}

	private static void dfs(int[] arr, int i, int start, int cnt, int n[]) {
		if (i >= arr.length)
			return;

		if (start == arr[i]) {
			check[i] = true;
			n[cnt - 1] = i;
			for (int j = 0; j < cnt; j++) {
				result[max + j] = n[j];
			}
			max += cnt;
			return;
		} else if (!check[i]) {
			check[i] = true;
			n[cnt - 1] = i;
			dfs(arr, arr[i], start, cnt + 1, n);
		}

		else {
			for (int j = 0; j < cnt - 1; j++) {
				check[n[j]] = false;
			}
		}

	}

}
