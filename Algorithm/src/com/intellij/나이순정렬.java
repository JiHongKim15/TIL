package com.intellij;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class 나이순정렬 {

    public static class User{
        int age;
        String name;

        User(int a, String n){
            this.age = a;
            this.name = n;
        }

        public int getAge(){
            return this.age;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<User> list = new ArrayList<>();

        for(int i=0; i<N; i++){
            String[] st = br.readLine().split(" ");
            int age = Integer.parseInt(st[0]);
            String name = st[1];

            list.add(new User(age, name));
        }

        list = list.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());

        for(User user : list){
            System.out.println(user.age + " " + user.name);
        }

    }
}
