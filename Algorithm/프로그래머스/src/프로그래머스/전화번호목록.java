package 프로그래머스;

import java.util.*;

public class 전화번호목록 {
    public static void main(String[] args) {
        String[] phone_book = { "12", "123", "1235", "567", "88" };

        System.out.println(solution(phone_book));
    }

    public static boolean solution(String[] phone_book) {
        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++) {
            hm.put(phone_book[i], i);
        }

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 1; j < phone_book[i].length(); j++) {

                if (hm.containsKey(phone_book[i].substring(0, j))) {
                    return false;
                }
            }

        }

        return true;

    }
}
