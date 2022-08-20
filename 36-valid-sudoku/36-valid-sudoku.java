class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean answer = true;

        //1. 가로
        answer = checkCol(board);

        //2. 세로
        if (answer)
            answer = checkRow(board);

        //3. 3*3
        if (answer)
            answer = checkSqr(board);


        return answer;
    }

    public boolean checkSqr(char[][] board) {
        boolean ans = true;

        char[][] subBoard = new char[3][3];

        int now = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                makeSubBoard(board, subBoard, i, j);
                if (!check33(subBoard)) {
                    ans = false;
                    break;
                }
            }
            if (!ans) break;
        }

        return ans;
    }

    public void makeSubBoard(char[][] board, char[][] subBoard, int i, int j) {

        for (int sr = 0; sr < 3; sr++) {
            for (int sc = 0; sc < 3; sc++) {
                subBoard[sr][sc] = board[i * 3 + sr][j * 3 + sc];
            }
        }


    }

    public boolean check33(char[][] board) {
        boolean ans = true;

        boolean[] num = new boolean[10];
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if ('.' == board[r][c]) continue;
                if (num[board[r][c] - '0']) {
                    ans = false;
                    break;
                }
                num[board[r][c] - '0'] = true;
            }
        }

        return ans;

    }

    public boolean checkRow(char[][] board) {
        boolean ans = true;

        int size = board.length;

        for (int r = 0; r < size; r++) {
            boolean[] num = new boolean[10];
            for (int c = 0; c < size; c++) {
                if ('.' == board[r][c]) continue;
                if (num[board[r][c] - '0']) {
                    ans = false;
                    break;
                }
                num[board[r][c] - '0'] = true;
            }
            if (!ans) break;
        }

        return ans;
    }

    public boolean checkCol(char[][] board) {
        boolean ans = true;

        int size = board.length;

        for (int c = 0; c < size; c++) {
            boolean[] num = new boolean[10];
            for (int r = 0; r < size; r++) {
                if ('.' == board[r][c]) continue;
                if (num[board[r][c] - '0']) {
                    ans = false;
                    break;
                }
                num[board[r][c] - '0'] = true;
            }
            if (!ans) break;
        }

        return ans;
    }
}