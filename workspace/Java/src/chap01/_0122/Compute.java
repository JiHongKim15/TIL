package chap01._0122;


import java.util.Scanner;

public class Compute {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("곱="+a*b);
		System.out.println("몫="+a/b);
	}
}
