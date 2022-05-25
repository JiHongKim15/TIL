package com.intellij;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 신입사원 {

    public static class Person{
        int f;
        int s;

        Person(int f, int s){
            this.f = f;
            this.s = s;
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int tc = 0; tc <T; tc++){
            int N = Integer.parseInt(br.readLine());
            List<Person> list = new ArrayList<>();

            for(int i=0; i<N; i++){
                String[] st = br.readLine().split(" ");
                int f = Integer.parseInt(st[0]);
                int s = Integer.parseInt(st[1]);

                list.add(new Person(f, s));
            }

            Collections.sort(list, new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                    if(o1.f == o2.f){
                        return o1.s - o2.s;
                    }
                    return o1.f- o2.f;
                }
            });







        }


    }
}
