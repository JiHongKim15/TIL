import java.util.Scanner;

public class 백설공주와일곱난쟁이_3040 {
	private static int[] arr;
	private static int minus;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		arr = new int[9];

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}

		minus = sum - 100;
		
		combination(0,0);

		for (int i = 0; i < arr.length; i++) {
			if(result[0] == arr[i] || result[1] == arr[i])
				continue;
			else
				System.out.println(arr[i]);
		}
	}

	static int[] sel = new int[2];
	static int[] result = new int[2];

	static void combination(int idx, int s_idx) {
		// 원하는 만큼 골랐으므로, 결과 뽑고 리턴
		if (s_idx == sel.length) {
			if(sel[0] + sel[1] == minus) {
				result[0] = sel[0];
				result[1] = sel[1];
			}
			return;
		}
		// 원하는 만큼 뽑지 못했지만, 더 이상 뽑을게 없으므로 리턴
		if (idx == arr.length)
			return;
		sel[s_idx] = arr[idx];
		// 다음 것을 고르기 위해 s_idx 증가
		combination(idx + 1, s_idx + 1);
		// 이번 고른 걸 무효시키기 위해 s_idx를 그대로
		combination(idx + 1, s_idx);
	}
}
