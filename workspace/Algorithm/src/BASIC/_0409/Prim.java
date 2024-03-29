package BASIC._0409;

import java.util.Arrays;
import java.util.Scanner;

public class Prim {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt(); //정점의 개수
		int E = sc.nextInt(); //간선의 개수
		int[][] adj = new int[V][V];
		//간선의 정보를 받음
		for(int i=0; i<E; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			adj[a][b] = c;
			adj[b][a] = c;
		}
		
		boolean[] check = new boolean[V];
		int[] key = new int[V]; //현재 선택된 정점들로부터 도달할 수 있는 최소거리
		int[] p = new int[V]; //최소신장트리의 구조를 저장할 배열
		//key의 초기값은 무한대
		Arrays.fill(key, Integer.MAX_VALUE);
		
		//아무거나 하나 선택 (처음 선택 = 루트, 부모X, 거리0)
		p[0] = -1;
		key[0] = 0;
		//이미 하나 고랐으니 나머지 V-1개 선택
		for(int i=0; i<V-1; i++) {
			int min = Integer.MAX_VALUE;
			//안골라진 것 중에서 key가 가장 작은 것을 뽑음
			int index = -1; //찾으면 위치를 저장
			for(int j=0; j<V; j++) {
				//안골라진지 검사, key의 최솟값 기억
				if(!check[j] && key[j] < min) {
					index = j;
					min = key[j];
				}
			}
			//index = 선택이 안된 정점 중 key가 가장 젤 작은 것이 들어와있음
			check[index] = true;
			//index 정점에서 출발하는 모든 간선에 대해서 key를 업데이트
			for(int j=0; j<V; j++) {
				//check가 안되있으면서, 간선은 존재하고,그 간선이 key값보다 작다면 key값을 업데이트
				if(!check[j] && adj[index][j] != 0 && key[j] > adj[index][j]) {
					p[j] = index;
					key[j] = adj[index][j];
				}
			}
		}
		
		int result = 0;
		for(int i=0; i<V; i++)
			result += key[i];
		System.out.println(result);
		System.out.println(Arrays.toString(p));
	}
}
