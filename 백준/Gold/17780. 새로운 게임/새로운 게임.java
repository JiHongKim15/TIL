import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Node[][] map = new Node[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = new Node();
                map[i][j].color = Integer.parseInt(st.nextToken());
            }
        }

        int[] dr = {0, 0, -1, 1};
        int[] dc = {1, -1, 0, 0};

        for (int i=0; i< K; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int dir = Integer.parseInt(st.nextToken());
            map[x-1][y-1].list.add(new Piece(i, dir-1));
        }

        int cnt = 0;

        while(true) {
            if (cnt > 1000) {
                System.out.println(-1);
                return;
            }

            cnt++;

            boolean flag = false;
            for(int i=0; i<K; i++){

                int startX = -1;
                int startY = -1;

                //시작 말 찾기
                for(int r=0; r<N; r++){
                    for(int c=0; c<N; c++){
                        if(map[r][c].list.isEmpty()){
                            continue;
                        }
                        Piece piece = map[r][c].list.get(0);

                        if(piece.num == i){
                            startX = r;
                            startY = c;
                            break;
                        }
                    }
                }

                if(startX == -1 && startY == -1){
                    continue;
                }

                Piece cur = map[startX][startY].list.get(0);

                int dir = cur.dir;

                int nextX = startX + dr[dir];
                int nextY = startY + dc[dir];

                //끝이거나 파란색인 경우
                if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= N || map[nextX][nextY].color == 2){
                    if(dir == 0){
                        cur.dir = 1;
                    }else if(dir == 1){
                        cur.dir = 0;
                    }else if(dir == 2){
                        cur.dir = 3;
                    }else if(dir == 3){
                        cur.dir = 2;
                    }

                    nextX = startX + dr[cur.dir];
                    nextY = startY + dc[cur.dir];

                    map[startX][startY].list.set(0, cur);

                    if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= N || map[nextX][nextY].color == 2){
                        continue;
                    }
                    else if(map[nextX][nextY].color == 0) {
                        map[nextX][nextY].list.addAll(map[startX][startY].list);
                        map[startX][startY].list.clear();
                        flag = true;
                    }
                    else if(map[nextX][nextY].color == 1){
                        Collections.reverse(map[startX][startY].list);
                        map[nextX][nextY].list.addAll(map[startX][startY].list);
                        map[startX][startY].list.clear();
                        flag = true;
                    }
                }
                else {
                    if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= N || map[nextX][nextY].color == 2){
                        continue;
                    }
                    else if(map[nextX][nextY].color == 0) {
                        map[nextX][nextY].list.addAll(map[startX][startY].list);
                        map[startX][startY].list.clear();
                        flag = true;
                    }
                    else if(map[nextX][nextY].color == 1){
                        Collections.reverse(map[startX][startY].list);
                        map[nextX][nextY].list.addAll(map[startX][startY].list);
                        map[startX][startY].list.clear();
                        flag = true;
                    }
                }
            }

            for(int i = 0; i<N; i++){
                for (int j= 0; j<N; j++){
                    int size = map[i][j].list.size();
                    if(size >= 4){
                        System.out.println(cnt);
                        return;
                    }
                }
            }

            if(!flag){
                System.out.println(-1);
                return;
            }

        }

    }

    public static class Node {
        int color;
        ArrayList<Piece> list = new ArrayList<>();
    }

    public static class Piece {
        int num;
        int dir;

        public Piece(int num, int dir) {
            this.num = num;
            this.dir = dir;
        }
    }

}