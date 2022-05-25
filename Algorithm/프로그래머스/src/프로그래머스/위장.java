package 프로그래머스;

import java.util.*;

public class 위장 {
    public static void main(String[] args) {
        String[][] clothes = { { "crow_mask", "face" }, { "blue_sunglasses", "face" }, { "smoky_makeup", "face" } };

        // { { "yellowhat", "headgear" }, { "bluesunglasses", "eyewear" },
        // { "green_turban", "headgear" } };

        System.out.println(solution(clothes));
    }

    public static int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> hm = new HashMap<>();

        for (String[] cloth : clothes) {
            if (hm.containsKey(cloth[1])) {
                hm.put(cloth[1], hm.get(cloth[1]) + 1);
            } else {
                hm.put(cloth[1], 1);
            }
        }

        for (String key : hm.keySet()) {
            answer *= hm.get(key) + 1;
        }

        return answer - 1;
    }
}
