package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 칸토어집합_4779 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String st = "";
		while ( (st=br.readLine()) != null) {
			int N = Integer.parseInt(st);
			result = new StringBuilder("");
			
			StringBuilder sb = new StringBuilder("");
			for (int i = 0; i < Math.pow(3, N); i++) {
				sb.append("-");
			}
			
			kanto(sb.toString());
			
		}

	}
	
	static StringBuilder result;

	private static void kanto(String st) {
		// TODO Auto-generated method stub
		int len = st.length();
		
		if(len == 1) {
			result.append(st);
		}
		
		String st1 = st.substring(0, len/3);
		String st2 = st.substring((len/3)*2, len);
		
		kanto(st1);
		kanto(st2);
	}
}
