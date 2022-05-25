package com.intellij;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 약속 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            Integer[] temp = Arrays.stream(br.readLine().split(" ")).toArray(Integer[] :: new);
            int A = temp[0];
            int B = temp[1];
        }


    }
}
