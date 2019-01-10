package MajorityElement;

import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {3, 2, 3};
        int[] b = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(solution.majorityElement(a));
        System.out.println(solution.majorityElement(b));
    }
}

class Solution {
    int majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        boolean find = false;
        int ans = 0;
        for (int num1 : nums) {
            if (!count.containsKey(num1)) {
                count.put(num1, 1);
            } else {
                count.put(num1, count.get(num1) + 1);
            }
            for (Map.Entry<Integer, Integer> entrys : count.entrySet()) {
                if (entrys.getValue() == nums.length / 2 + 1) {
                    find = true;
                    ans = entrys.getKey();
                    break;
                }
            }
            if (find)
                break;
        }
        return ans;
    }
}