package com.intellij;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class 베스트셀러 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(br.readLine());
            Map<String, Integer> list = new HashMap();

            for (int i = 0; i < N; i++) {
                String s = br.readLine();
                if(list.containsKey(s)){
                    list.put(s, list.get(s)+1);
                }
                else{
                    list.put(s, 0);
                }
            }

        Map.Entry<String, Integer> ent = list.entrySet().stream()
                    .sorted(new Comparator<Map.Entry<String, Integer>>() {
                        @Override
                        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                            if(o1.getValue() == o2.getValue()){
                                return o1.getKey().compareTo(o2.getKey());
                            }
                            return o2.getValue() - o1.getValue();
                        }
                    }).collect(Collectors.toList())
                    .get(0);

            System.out.println(ent.getKey());




    }

}
