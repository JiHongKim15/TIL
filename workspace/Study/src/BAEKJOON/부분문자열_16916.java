package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class 부분문자열_16916 {

	public static int pi[];
	private static String S;
	private static String P;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 S = br.readLine();
		 P = br.readLine();
		
		pi = new int[S.length()];
		
		getPi();
		System.out.println(KMP()?1:0);
		
	}
	
	private static void getPi() {
		// TODO Auto-generated method stub
		int j =0;
		for (int i = 1; i < P.length(); i++) {
			
			while(j >0 && P.charAt(i) != P.charAt(j)) {
				j = pi[j-1];
			}
			
			if(P.charAt(i) == P.charAt(j)) {
				pi[i] = ++j;
			}
		}
	}
	private static boolean KMP() {
		// TODO Auto-generated method stub
		int j =0;
		for (int i = 0; i < S.length(); i++) {
			
			while(j >0 && S.charAt(i) != P.charAt(j)) {
				j = pi[j-1];
			}
			
			if(S.charAt(i) == P.charAt(j)) {
				if(j == P.length()-1) {
					return true;
				}
				else ++j;
			}
			
		}
		return false;
	}
}
