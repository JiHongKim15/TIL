package com.intellij;

import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static String solution(int[] numbers, String hand) {
        String answer = "";

        int[] dr = {0, 0, 1, -1};
        int[] dc = {1, -1, 0, 0};

        int left0 = 3; int left1 = 0;
        int right0 = 3; int right1 = 2;

        for(int i=0; i<numbers.length; i++){
            int num = numbers[i];
            if(num == 1 || num == 4 || num == 7){
                left1 = 0;
                answer += "L";
                if(num == 1) left0 = 0;
                if(num == 4) left0 = 1;
                if(num == 7) left0 = 2;

            }

            else if(num == 3 || num == 6 || num == 9){
                right1 = 2;
                answer += "R";
                if(num == 3) right0 = 0;
                if(num == 6) right0 = 1;
                if(num == 9) right0 = 2;
            }

            else{
                int target0 = -1;
                int target1 = 1;

                if(num == 2) target0 = 0;
                else if(num == 5) target0 = 1;
                else if(num == 8) target0 = 2;
                else if(num == 0) target0 = 3;

                int l = Math.abs(target0 - left0) + Math.abs(target1 - left1);
                int r = Math.abs(target0 - right0) + Math.abs(target1 - right1);

                if(l < r){
                    answer += "L";
                    left0 = target0;
                    left1 = target1;
                }else if( l > r){
                    answer += "R";
                    right0 = target0;
                    right1 = target1;
                }else{
                    if(hand.equals("right")){
                        answer += "R";right0 = target0;
                        right1 = target1;
                    }else {
                        answer += "L";
                        left0 = target0;
                        left1 = target1;
                    }
                }

            }

        }


        return answer;
    }


    public static void main(String[] args) {
       int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
       String hand = "right";

       System.out.println(solution(numbers, hand));
    }
}
