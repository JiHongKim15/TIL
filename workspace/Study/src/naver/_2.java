package naver;

public class _2 {
	public static void main(String[] args) {
		int n = 9;
		int[][] edges = {
				{0, 2},
				{2, 1},
				{2, 4},
				{3, 5},
				{5, 4},
				{5, 7},
				{7, 6},
				{6, 8}
		};
	}
	public int[] solution (int n, int[][] edges) {
		int[] answer = {};
		
		
		int[][] v = new int[n][n];
		
		for (int i = 0; i < n-1; i++) {
			v[edges[i][0]][edges[i][1]] = 1;
			v[edges[i][1]][edges[i][0]] = 1;
		}
		
		return answer;
	}
}
