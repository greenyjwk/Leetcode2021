package Array;

import java.util.HashSet;
import java.util.Set;

public class LC217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) return true;
            else set.add(num);
        }
        return false;
    }
}

/*
    Time Complexity  : O(n)
    Space Complexity : O(1)
*/