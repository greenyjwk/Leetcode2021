package Array;

import java.util.HashMap;
import java.util.Map;

public class LC1 {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[2];

        for (int i = 0 ;  i < nums.length ; i++) {
            if (!map.containsKey(target - nums[i])) map.put( nums[i] , i );
            else{
                answer[1] = map.get(target-nums[i]);
                answer[0] = i;
            }
        }
        return answer;
    }
}


/*

Time Complexity : O(n)
    - We traverse the outer list that contains n elements

Space Complexity : O(n)
    - Extra space are required depending on the elements that are stored in the hashtable

 */
