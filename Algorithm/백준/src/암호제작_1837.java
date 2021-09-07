import java.util.Scanner;

public class 암호제작_1837 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String P = sc.next();
		int K = sc.nextInt();
	
		for (int i = 2; i < K; i++) {
		
			int ret = 0;
			char[] arr = P.toCharArray();
			for (int j = 0; j < arr.length; j++) {
				ret = (ret * 10 + (arr[j] - '0')) % i;
			}
			if(ret == 0) {
				System.out.println("BAD " + i);
				return;
			}
		
		}
		 System.out.println("GOOD");
				
				
	}
	
}
