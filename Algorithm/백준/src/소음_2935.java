import java.util.Arrays;
import java.util.Scanner;

public class 소음_2935 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a = sc.next();
		String sy = sc.next();
		String b = sc.next();
		
		if(sy.equals("*")) {
			int sum = (a.length()-1) + (b.length()-1);
			String result = "1";
			for (int i = 0; i < sum; i++) {
				result += "0";
			}
			System.out.println(result);
		}
		else {
			if(a.length() == b.length()) {
				String result = "2";
				for (int i = 0; i < a.length()-1; i++) {
					result += "0";
				}
				System.out.println(result);
			}
			else if(a.length() > b.length()) {
				char[] al = a.toCharArray();
				al[a.length() - b.length()] = '1';
				for (int i = 0; i < al.length; i++) {
					System.out.print(al[i]);
				}
			}
			else if(a.length() < b.length()) {
				char[] al = b.toCharArray();
				al[b.length() - a.length()] = '1';
				for (int i = 0; i < al.length; i++) {
					System.out.print(al[i]);
				}
			}
		}
	}
}
