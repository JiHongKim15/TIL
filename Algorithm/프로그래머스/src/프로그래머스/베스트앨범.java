package 프로그래머스;

import java.util.*;

public class 베스트앨범 {
    public static void main(String[] args) {
        String[] genres = { "classic", "pop", "classic", "classic", "pop" };
        int[] plays = { 500, 600, 150, 800, 2500 };

        System.out.println(solution(genres, plays));
    }

    public static int[] solution(String[] genres, int[] plays) {

        HashMap<String, Integer> genresPlays = new HashMap<>();
        HashMap<String, ArrayList<Integer>> hm = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            if (hm.containsKey(genres[i])) {
                ArrayList<Integer> al = hm.get(genres[i]);
                al.add(i);
                hm.put(genres[i], al);

                genresPlays.put(genres[i], genresPlays.get(genres[i]) + plays[i]);
            } else {
                ArrayList<Integer> al = new ArrayList<>();
                al.add(i);
                hm.put(genres[i], al);

                genresPlays.put(genres[i], plays[i]);
            }

        }

        for (String key : hm.keySet()) {
            ArrayList<Integer> al = hm.get(key);
            Collections.sort(al, new Comparator<Integer>() {
                @Override
                public int compare(Integer i1, Integer i2) {
                    return plays[i2] - plays[i1];
                }
            });

            hm.put(key, al);
        }

        List<Map.Entry<String, Integer>> eList = new ArrayList<Map.Entry<String, Integer>>(genresPlays.entrySet());

        Collections.sort(eList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        int idx = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        for (Map.Entry<String, Integer> key : eList) {
            ArrayList<Integer> al = hm.get(key.getKey());
            for (int i = 0; i < 2; i++) {
                ans.add(al.get(i));
                if (al.size() == 1) {
                    break;
                }
            }
        }

        int[] answer = new int[ans.size()];
        for (Integer i : ans) {
            answer[idx++] = i;
        }

        return answer;
    }
}
