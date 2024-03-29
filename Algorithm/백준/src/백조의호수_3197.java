import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 하나의 반복문 안에서 이중 BFS
 * 다시 풀어볼 것
 * 다음 녹여야 할 것을 생각해야 함
 * 
 * @author 15com
 *
 */

public class 백조의호수_3197 {
	static class Node {
		int r;
		int c;

		Node(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}

	static int[] dr = { 0, 0, 1, -1 };
	static int[] dc = { 1, -1, 0, 0 };
	static boolean meet = false;
	private static char[][] map;
	static boolean swan_check[][];
	static Queue<Node> swan;
	static Queue<Node> swan_ice;
	static Queue<Node> water;
	static Queue<Node> water_ice;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();

		map = new char[R][C];
		
		swan_check = new boolean[R][C];

		swan = new LinkedList<>();
		swan_ice = new LinkedList<>();
		water = new LinkedList<>();
		water_ice = new LinkedList<>();
		
		Node last = null;
		for (int i = 0; i < R; i++) {
			String buf = sc.next();
			for (int j = 0; j < C; j++) {
				map[i][j] = buf.charAt(j);
				if (map[i][j] != 'X') {
					water.add(new Node(i,j));
				}
				if (map[i][j] == 'L') {
					last = new Node(i, j);
				}
			}
		}

		int result = 0;
		
		swan.add(last);
		swan_check[last.r][last.c] = true; 

		while (!meet) {
			swan_bfs();
			if(meet)
				break;
			water_bfs();
			
			swan = swan_ice;
			water = water_ice;
			
			swan_ice = new LinkedList<>();
			water_ice = new LinkedList<>();
			
			
			
			result++;
		}
		
		System.out.println(result);

	}
	
	private static void swan_bfs() {
		// TODO Auto-generated method stub
		while(!swan.isEmpty()) {
			Node buf = swan.poll();
			for (int d = 0; d < 4; d++) {
				int cr = buf.r + dr[d];
				int cc = buf.c + dc[d];
				
				if(cr < 0 || cc < 0 || cr >= map.length || cc >= map[0].length || swan_check[cr][cc])
					continue;
				
				if(map[cr][cc] == '.') {
					swan_check[cr][cc] = true;
					swan.add(new Node(cr, cc));
				}
				
				
				else if(map[cr][cc] == 'L')
				{
					meet = true;
					return;
				}
//				빙하에 접할때
				else if(map[cr][cc] == 'X') {
					swan_check[cr][cc] = true;
					swan_ice.add(new Node(cr,cc));
				}
				
			}
		}
	}

	private static void water_bfs() {
		// TODO Auto-generated method stub
		while(!water.isEmpty()) {
			Node buf = water.poll();
			for (int d = 0; d < 4; d++) {
				int cr = buf.r + dr[d];
				int cc = buf.c + dc[d];
				
				if(cr < 0 || cc < 0 || cr >= map.length || cc >= map[0].length)
					continue;
				if(map[cr][cc] == 'X') {
					map[cr][cc] = '.';
					water_ice.add(new Node(cr,cc));
				}
			}
		}
	}
	
	

}
