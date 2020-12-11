package 이것이코딩테스트다;

import java.util.Scanner;

/**
 * 서로 다른 볼링 공의 무게를 고르는 방법(조합)
 * --> 이중포문으로 간단하게 풀 수 있음
 * 
 * 그리디하게 푸는법
 * --> 각 step이 지날수록 이미 계산했던 조합을 없애는 방법
 * 무게 존재를 명시했으므로 (M은 10을 넘을 수 없음) -> 하나의 리스트 변수 선언하여 무게별 볼링공 개수 세기
 * @author 15com
 *
 */
public class 볼링공고르기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] K = new int[N];
		int[] weight = new int[M+1];
		
		for (int i = 0; i < K.length; i++) {
			K[i] = sc.nextInt();
			weight[K[i]]++;
		}
		
		int result = 0;
//		무게를 기준으로
		for (int i = 1; i < weight.length; i++) {
//			앞의 무게는 빼줘야 함
			N -= weight[i]; // 전체 볼링공 개수 - 무게가 i인 볼링공 개수 = B가 선택 가능한 볼링공 개수
			result += weight[i] * N; // A가 선택한 볼링공 무게의 개수 * B가 선택 가능한 볼링공 개수
		}
		
		System.out.println(result);
	}
}
