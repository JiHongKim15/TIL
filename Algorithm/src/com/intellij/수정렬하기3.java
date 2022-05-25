package com.intellij;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 수정렬하기3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for(int i=0; i<N; i++){
           arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for(int a : arr)
            System.out.println(a);

    }
}
