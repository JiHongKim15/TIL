package com.intellij;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 수열정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        Integer[] arr = Arrays.stream(Arrays.stream(N.chars().toArray())
                .boxed()
                .toArray(Integer[] :: new))
                .sorted(Comparator.reverseOrder())
                .toArray(Integer[] :: new);

        for(int a : arr){
            System.out.print(a -'0');
        }


    }
}
