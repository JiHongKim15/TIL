package BAEKJOON;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 강의실_1374 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][3];
		
		for (int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			arr[i][2] = sc.nextInt();
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				
				if(o1[1] == o2[1]) {
					return o2[2] - o1[2];
				}
				
				return o1[1] - o2[1];
			}
		
		});
		
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			while(!pq.isEmpty()) {
				if(pq.peek() <= arr[i][1])
					pq.poll();
				else
					break;
			}
			
			pq.add(arr[i][2]);
			max = Math.max(pq.size(), max);
		}
		
		System.out.println(max);
	}
}
