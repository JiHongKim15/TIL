import java.util.PriorityQueue;
import java.util.Scanner;

public class 약수들의합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int N = sc.nextInt();
			if(N == -1)
				break;
			int sum = 1;
			PriorityQueue<Integer> q = new PriorityQueue<>();
			for (int i = 2; i < N; i++) {
				if(N % i == 0) {
					q.add(i);
					sum += i;
				}
			}
			if(sum == N) {
				int size = q.size();
				System.out.print(N + " = ");
				System.out.print("1 + ");
				for (int i = 0; i < size-1; i++) {
					System.out.print(q.poll() + " + ");
				}
				System.out.println(q.poll());
				
			}
			else {
				System.out.println(N + " is NOT perfect.");
			}
			
		}
	}
}
