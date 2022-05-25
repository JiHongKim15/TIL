package 프로그래머스;

import java.util.*;

public class 로또의
최고 순위와
최저 순위
{

    public static void main(String[] args) {
        int[] lottos = { 44, 1, 0, 0, 31, 25 };
        int[] win_nums = { 31, 10, 45, 1, 6, 19 };

        /*
         * 6 -> 1
         * 5 -> 2
         * 4 -> 3
         * 3-> 4
         * 2 -> 5
         * 1 -> 6
         * 
         */
        HashSet<Integer> win = new HashSet<>();

        for (int i = 0; i < win_nums.length; i++) {
            win.add(win_nums[i]);
        }

        int t = 2;
        for (int i = 0; i < lottos.length; i++) {
            if (win.contains(lottos[i])) {
                t++;
            }
        }

        int[] answer = new int[2];
        int[] arr = { 0, 6, 5, 4, 3, 2, 1 };

        int top = t + zero < 7 ? t + zero : 7;
        answer[0] = arr[top];

        int low = t - zero >= 0 ? t - zero : 1;
        answer[1] = arr[t - zero];

        return;
    }
}
