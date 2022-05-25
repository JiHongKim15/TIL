package com.intellij;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class 폰켓몬 {
    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,4};

        System.out.println(solution(nums));
    }
    public static int solution(int[] nums) {
        return Integer.min(nums.length/2, (int) Arrays.stream(nums)
                .distinct()
                .count());
    }

}
