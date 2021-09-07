package 연습장;

import java.util.Arrays;

//理쒖냼怨듬같�닔, 理쒕�怨듭빟�닔
//next_permutation
public class 좋은아침0227 {
	public static void main(String[] args) {
		int a = 5;
		int b = 3;

		int g = gcd(a, b);
		System.out.println("理쒕�怨듭빟�닔: " + g);

		int l = a * b / g;
		System.out.println("理쒖냼怨듬같�닔: " + l);

		// next_permutation
		int arr[] = { 1, 2, 3, 4 };
		Arrays.sort(arr); // �빆�긽 �닚�꽌��濡�
		System.out.println("諛곗뿴: " + Arrays.toString(arr));
		next_permutation(arr);
		System.out.println("�떎�쓬 �닚�뿴: "+Arrays.toString(arr));

		prev_permutation(arr);
		System.out.println("�씠�쟾 �닚�뿴: "+ Arrays.toString(arr));
		
		System.out.println("紐⑤뱺 �닚�뿴");
		do {
			System.out.println(Arrays.toString(arr));
		}while(next_permutation(arr));
	}

	private static boolean prev_permutation(int[] arr) {
		// 1243

		int idx = arr.length - 1; // 理쒕� �씤�뜳�뒪
		// idx = 3;

		// arr[idx-1] <= arr[idx]�씪 �븣 諛섎났
		// arr[idx-1] > arr[idx]�씠硫� 醫낅즺
		while (idx > 0 && arr[idx - 1] <= arr[idx])
			idx--;
		// idx = 3 (諛섎났臾� 諛붾줈 �깉異�)
		// arr[idx-1] =4 > arr[idx] = 3

		if (idx <= 0)
			return false; // �떎�쓬 �닚�뿴�씠 議댁옱�븯吏� �븡�쓬

		int i = arr.length - 1;
		// i = 3

		// arr[idx-1] <= a[i]�씪 �븣 諛섎났
		// arr[idx-1] > a[i]媛� �릺硫� 醫낅즺
		while (arr[idx - 1] <= arr[i])
			i--;
		// arr[idx-1] = 4
		// arr[i] = 3
		// i = 3 (index湲곗�)

		// idx=3, i =3
		// idx-1怨� i瑜� 諛붽퓞
		swap(arr, idx - 1, i); // �몢媛쒕�� 諛붽퓞

		// j=3
		int j = arr.length - 1;
		// 湲곗�媛믪쓽 �쐞移� idx遺��꽣 �뮘�뿉 �엳�뒗 �닽�옄�뱾�쓣 諛붽퓞
		while (idx < j) {
			// idx=3, j = 3
			// 諛붾�� �뾾�씠 諛붾줈 �깉異�
			swap(arr, idx, j);
			idx++;
			j--;
		}
		// 理쒖쥌寃곌낵: 1243
		return true;
	}

	private static boolean next_permutation(int[] arr) {
		// 1234

		int idx = arr.length - 1; // 理쒕� �씤�뜳�뒪
		// idx = 3;

		// arr[idx-1] >= arr[idx]�씪 �븣 諛섎났
		// arr[idx-1] < arr[idx]�씠硫� 醫낅즺
		while (idx > 0 && arr[idx - 1] >= arr[idx])
			idx--;
		// idx = 3 (諛섎났臾� 諛붾줈 �깉異�)
		// arr[idx-1] =3 < arr[idx] = 4

		if (idx <= 0)
			return false; // �떎�쓬 �닚�뿴�씠 議댁옱�븯吏� �븡�쓬

		int i = arr.length - 1;
		// i = 3

		// arr[idx-1] >= a[i]�씪 �븣 諛섎났
		// arr[idx-1] < a[i]媛� �릺硫� 醫낅즺
		while (arr[idx - 1] >= arr[i])
			i--;
		// arr[idx-1] = 3
		// arr[i] = 4
		// i = 3 (index湲곗�)

		// idx=3, i =3
		// idx-1怨� i瑜� 諛붽퓞
		swap(arr, idx - 1, i); // �몢媛쒕�� 諛붽퓞

		// j=3
		int j = arr.length - 1;
		// 湲곗�媛믪쓽 �쐞移� idx遺��꽣 �뮘�뿉 �엳�뒗 �닽�옄�뱾�쓣 諛붽퓞
		while (idx < j) {
			// idx=3, j = 3
			// 諛붾�� �뾾�씠 諛붾줈 �깉異�
			swap(arr, idx, j);
			idx++;
			j--;
		}
		// 理쒖쥌寃곌낵: 1243
		return true;

	}

	private static void swap(int[] arr, int idx, int i) {
		// TODO Auto-generated method stub
		int temp = arr[idx];
		arr[idx] = arr[i];
		arr[i] = temp;
	}

	private static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

}
