package com.intellij;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class K번째수 {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 2, 6, 3, 7, 4};
        int[][] commnads = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(solution(numbers, commnads)));
    }
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int z=0; z<commands.length; z++){

            int i= commands[z][0];
            int j = commands[z][1];
            int k = commands[z][2];

            List<Integer> temp = Arrays.stream(array)
                            .boxed()
                            .collect(Collectors.toList())
                            .subList(i-1, j);

            Collections.sort(temp);
            answer[z] = temp.get(k-1);

        }



        return answer;
    }

}
