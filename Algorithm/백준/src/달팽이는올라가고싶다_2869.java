import java.util.Scanner;

public class 달팽이는올라가고싶다_2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		
		int a = 0;
		if((V-A)% (A-B) != 0) {
			a = (V-A)/(A-B) +1;
		}
		else
			a = (V-A)/(A-B);
		
		System.out.println(a + 1);
		
	}
}
