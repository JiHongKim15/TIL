package BAEKJOON;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class 도서관_1461 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		ArrayList<Integer> book_m = new ArrayList<>();
		ArrayList<Integer> book_p = new ArrayList<>();

		int max_a = 0;
		int max = 0;
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			if (max_a < Math.abs(a)) {
				max_a = Math.abs(a);
				max = a;
			}
			if (a < 0)
				book_m.add(a);
			else
				book_p.add(a);
		}

		Collections.sort(book_m, Comparator.reverseOrder());
		Collections.sort(book_p);

		int result = 0;
		
		if(max < 0) {
			for (int i = 0; i < M; i++) {
				if(!book_m.isEmpty())book_m.remove(book_m.size()-1);
			}
		}
		else {
			for (int i = 0; i < M && book_p.size() > 0; i++) {
				if(!book_p.isEmpty())book_p.remove(book_p.size()-1);
			}
		}
		
		for (int i = book_m.size()-1; i>=0; i-=M) {
			if(i >= 0) result += Math.abs(book_m.get(i))*2;
		}
		for (int i = book_p.size()-1; i>=0; i-=M) {
			if(i>= 0)result += Math.abs(book_p.get(i))*2;
		}
		
		result += max_a;
		System.out.println(result);
	}
}
